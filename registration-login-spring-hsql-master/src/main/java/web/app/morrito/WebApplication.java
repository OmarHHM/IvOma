package web.app.morrito;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.spring.DwrAnnotationPostProcessor;
import org.directwebremoting.spring.DwrSpringServlet;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.type.filter.AnnotationTypeFilter;


import web.app.morrito.settings.DwrSettings;
@Configuration
@SpringBootApplication
@ComponentScan({"web.app.morrito", "controller"})
public class WebApplication extends SpringBootServletInitializer {
	
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
    
    /*
    @Bean
	public DwrAnnotationPostProcessor dwrAnnotationPostProcessor( ApplicationContext applicationContext )
	{
		final BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext.getAutowireCapableBeanFactory();
		final ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner (beanDefinitionRegistry);
        scanner.addIncludeFilter(new AnnotationTypeFilter(DataTransferObject.class));
        scanner.scan("web.app.morrito.model.**");
        
		return new DwrAnnotationPostProcessor();
	}*/

	/*
	@Bean
	public ServletRegistrationBean dwrSpringServletRegistration( DwrSettings dwrSettings )
	{
		final ServletRegistrationBean registration = new ServletRegistrationBean( new DwrSpringServlet(), "/broker/*" );
		registration.addInitParameter( "debug", String.valueOf(dwrSettings.isDebug()) );
		registration.addInitParameter( "scriptCompressed", String.valueOf(dwrSettings.isScriptCompressed()) );
		registration.setName( "dwrSpringServlet" );
		return registration;
	}*/
    
}
