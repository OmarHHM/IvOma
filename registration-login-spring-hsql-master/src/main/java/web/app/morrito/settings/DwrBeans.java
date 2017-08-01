package web.app.morrito.settings;

import org.directwebremoting.annotations.DataTransferObject;
import org.directwebremoting.spring.DwrAnnotationPostProcessor;
import org.directwebremoting.spring.DwrSpringServlet;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;

//@Configuration
public class DwrBeans {
	/* @Bean
		public DwrAnnotationPostProcessor dwrAnnotationPostProcessor( ApplicationContext applicationContext )
		{
			final BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) applicationContext.getAutowireCapableBeanFactory();
			final ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner (beanDefinitionRegistry);
	        scanner.addIncludeFilter(new AnnotationTypeFilter(DataTransferObject.class));
	        scanner.scan("web.app.morrito.model.**");
	        
			return new DwrAnnotationPostProcessor();
		}
		@Bean
		public ServletRegistrationBean dwrSpringServletRegistration( DwrSettings dwrSettings )
		{
			final ServletRegistrationBean registration = new ServletRegistrationBean( new DwrSpringServlet(), "/**" );
			registration.addInitParameter( "debug", String.valueOf(dwrSettings.isDebug()) );
			registration.addInitParameter( "scriptCompressed", String.valueOf(dwrSettings.isScriptCompressed()) );
			registration.setName( "dwrSpringServlet" );
			return registration;
		}
*/}
