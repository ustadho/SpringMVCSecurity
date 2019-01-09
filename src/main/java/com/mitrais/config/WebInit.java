package com.mitrais.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.persistence.criteria.Root;

@Configuration
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Autowired
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebSecurityConfig.class};
    }

    @Autowired
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Autowired
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
