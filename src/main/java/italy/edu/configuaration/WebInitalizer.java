package italy.edu.configuaration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitalizer implements WebApplicationInitializer  {
	
	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(SpringConfiguration.class);
		ctx.setServletContext(container);

	//Nếu nhập đường dẫn sai	
	DispatcherServlet dispatcherServlet = new DispatcherServlet(ctx);
	dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
		
	ServletRegistration.Dynamic registration = container.addServlet("dispatcher",dispatcherServlet);
	registration.setLoadOnStartup(1);
	registration.addMapping("/");

	CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8",true);
	container.addFilter("encodingFilter", filter).addMappingForUrlPatterns(null, false, "/*");
	}

}
