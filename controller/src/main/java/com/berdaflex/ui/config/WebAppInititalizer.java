package com.berdaflex.ui.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by alexander_borohov on 26.9.16.
 */
public class WebAppInititalizer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
/*        AnnotationConfigWebApplicationContext rootContext
                = new AnnotationConfigWebApplicationContext();
        rootContext.register();

        servletContext.addListener(new ContextLoaderListener(rootContext));*/

        AnnotationConfigWebApplicationContext dispatherServlet
                = new AnnotationConfigWebApplicationContext();
        dispatherServlet.register(WebAppContext.class);

        ServletRegistration.Dynamic dispather = servletContext
                .addServlet("dispatcher", new DispatcherServlet(dispatherServlet));

        dispather.setLoadOnStartup(1);
        dispather.addMapping("/");

    }
}
