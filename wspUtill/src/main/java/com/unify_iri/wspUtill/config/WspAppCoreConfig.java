package com.unify_iri.wspUtill.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages   ={"com.unify_iri.wspUtill"},
			   excludeFilters ={
					   @Filter(type  = FilterType.ANNOTATION,
										   value = EnableWebMvc.class)})
@EnableTransactionManagement
public class WspAppCoreConfig {

}
 