package com.unify_iri.wspUtill.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WspAppInitilazer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{WspAppCoreConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WspAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	} 
}
