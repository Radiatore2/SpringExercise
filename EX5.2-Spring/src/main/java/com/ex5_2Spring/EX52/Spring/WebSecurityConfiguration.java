package com.ex5_2Spring.EX52.Spring;



import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
@EnableWebSerity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration defaultCors = new CorsConfiguration().applyPermitDefaultValues();
		defaultCors.addAllowedOrigin("http://localhost:8080");
		defaultCors.setAllowedMethods(Arrays.asList("GET", "POST", "PATCH", "OPTIONS"));
		source.registerCorsConfiguration("/**", defaultCors);
		return source;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		http.authorizeRequests()
				.antMatchers("/**").permitAll()
				.antMatchers().authenticated();


		http.csrf().disable();

	}
}
