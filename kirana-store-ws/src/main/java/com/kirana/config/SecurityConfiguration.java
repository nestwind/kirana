package com.kirana.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/",
					"/js/**",
					"/css/**",
					"/img/**"				
					).permitAll()

/*
//added later		
		.antMatchers("/getreportbyduration")
		.hasAnyRole("ADMIN", "USER")

		.anyRequest().authenticated()
//added later
*/		
		.and()
		.exceptionHandling().accessDeniedPage("/forbidden.html")
		
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/home")
		.failureUrl("/login?error")
		.permitAll()
		.and()
		
		.logout()
		.invalidateHttpSession(true)
		.clearAuthentication(true)		
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout")
		.permitAll()
		;

	}

}
