package web.app.morrito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.annotations.GlobalFilter;
import org.directwebremoting.annotations.RemoteProxy;
import org.directwebremoting.spring.DwrClassPathBeanDefinitionScanner;
import org.directwebremoting.spring.DwrController;
import org.directwebremoting.spring.DwrHandlerMapping;
import org.directwebremoting.spring.DwrSpringServlet;
import org.directwebremoting.spring.SpringConfigurator;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;

//@EnableWebMvc
@SpringBootApplication
@ImportResource(value = "classpath:/META-INF/spring/ivoma-context.xml")
@ComponentScan({"web.app.morrito", "controller"})
public class WebApplication extends SpringBootServletInitializer {
	
	 public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
    
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {    	
        return application.sources(WebApplication.class);
    }
    
   /* @Bean (name="dwrSpringServlet")
	public ServletRegistrationBean dwrSpringServletRegistration()
	{
		final ServletRegistrationBean registration = new ServletRegistrationBean( new DwrSpringServlet(), "/api/*" );
		registration.addInitParameter( "debug", "true" );
		registration.setName( "dwrSpringServlet" );
		return registration;
	}
  
    @Bean
    public DwrController dwrController(ApplicationContext applicationContext){
    
        BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry)applicationContext.getAutowireCapableBeanFactory();
        Map<String,String> configParam = new HashMap<String, String>();
        configParam.put("activeReverseAjaxEnabled","true");
    
        ClassPathBeanDefinitionScanner scanner = new DwrClassPathBeanDefinitionScanner(beanDefinitionRegistry);
        scanner.addIncludeFilter(new AnnotationTypeFilter(RemoteProxy.class));
        scanner.addIncludeFilter(new AnnotationTypeFilter(DataTransferObject.class));
        scanner.addIncludeFilter(new AnnotationTypeFilter(GlobalFilter.class));
        scanner.scan("web.app.morrito");
    
        DwrController dwrController = new DwrController();
        dwrController.setDebug(true);
        dwrController.setConfigParams(configParam);
    
        SpringConfigurator springConfigurator = new SpringConfigurator();
        List configurators = new ArrayList();
        configurators.add(springConfigurator);
        dwrController.setConfigurators(configurators);
        return dwrController;
    }
    
   @Bean
    public BeanNameUrlHandlerMapping beanNameUrlHandlerMapping(){
        BeanNameUrlHandlerMapping beanNameUrlHandlerMapping = new BeanNameUrlHandlerMapping();
        return beanNameUrlHandlerMapping;
    }
    *//*
    @Bean
    public DwrHandlerMapping dwrHandlerMapping(DwrController dwrController){
        Map<String,DwrController> urlMap = new HashMap<String, DwrController>();
        urlMap.put*///("/dwr/**/*",dwrController);
    /*
        DwrHandlerMapping dwrHandlerMapping = new DwrHandlerMapping();
        dwrHandlerMapping.setAlwaysUseFullPath(true);
        dwrHandlerMapping.setUrlMap(urlMap);
        return dwrHandlerMapping;
    }
    */
    
}
