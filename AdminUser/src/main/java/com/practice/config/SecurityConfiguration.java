package com.practice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.practice.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	
	@Autowired
	private UserService userService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth=new DaoAuthenticationProvider();
		
		auth.setUserDetailsService(userService);
		auth.setPasswordEncoder(passwordEncoder());
		
		return auth;
	}
	
	
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
		
//		auth.inMemoryAuthentication().withUser("amanverma@gmail.com").password("12345").authorities("ROLE_ADMIN");
//	 auth.inMemoryAuthentication().withUser("pradeepnishad@gmail.com").password("1234").authorities("ROLE__USER");
//		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/registration**","/js**","/css**","/img**").permitAll()
//		.antMatchers("/registration**").hasRole("ROLE_ADMIN")
//		.antMatchers("/registration**","/user").hasRole("ROLE_USER")
		
		.anyRequest().authenticated().and()
		.formLogin()
		.loginPage("/login")
//		.loginProcessingUrl("/")
		.permitAll()
		.and()
		.logout()
		.invalidateHttpSession(true)
		.clearAuthentication(true)
		.logoutRequestMatcher(new  AntPathRequestMatcher("/logout"))
		.logoutSuccessUrl("/login?logout");
		
		
		
	}

}
