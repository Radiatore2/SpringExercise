package com.example.E1.Interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVC implements WebMvcConfigurer {
	@Autowired
	private LegacyInterceptor legacyInterceptor;
	@Autowired
	private APILoggingInterceptor apiLoggingInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(legacyInterceptor);
		registry.addInterceptor(apiLoggingInterceptor);
	}
}
