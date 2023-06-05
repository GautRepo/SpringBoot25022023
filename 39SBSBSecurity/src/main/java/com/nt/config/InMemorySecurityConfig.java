package com.nt.config;

/*@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)*/
public class InMemorySecurityConfig /*extends WebSecurityConfigurerAdapter */{
	/*
	
	
	//@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	auth.inMemoryAuthentication().withUser("GAUT").password("{noop}GAUT").authorities("ADMIN");
	auth.inMemoryAuthentication().withUser("BHAD").password("{noop}BHAD").authorities("EMP");
	
	}
	
	//@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	.antMatchers("/home").permitAll()
	.antMatchers("/admin").hasAuthority("ADMIN")
	.antMatchers("/common").hasAnyAuthority("ADMIN","EMP")
	.antMatchers("/emp").authenticated()
	
	.and()
	.formLogin()
	.permitAll()
	
	.and()
	.logout()
	
	.and()
	.exceptionHandling()
	.accessDeniedPage("/denied");
	}
	
	*/}
