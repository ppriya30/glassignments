package com.glearning.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

//configure thymeleaf
@EnableWebMvc
@ComponentScan({"com.glearning.config","com.glearning.dispatcher","com.glearning.web"})
@Configuration
public class SpringConfig {
	
	//application context
	@Autowired
	private ApplicationContext applicationContext;
	
	
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext((org.springframework.context.ApplicationContext) applicationContext);
		templateResolver.setPrefix("/WEB-INF/view/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);
		templateResolver.setCacheable(true);
		return templateResolver;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine() {
		
	SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	templateEngine.setTemplateResolver(this.templateResolver());
	templateEngine.setEnableSpringELCompiler(true);
	return templateEngine;
	}
	
	
	
	//configure thymeleaf view resolver
	@Bean
	public ThymeleafViewResolver viewResolver() {
		ThymeleafViewResolver  viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		return viewResolver;
	}
	

}
