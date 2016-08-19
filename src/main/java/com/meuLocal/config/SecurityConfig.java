package com.meuLocal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import javax.sql.DataSource;
import org.springframework.core.env.Environment;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity https) throws Exception {
    https.authorizeRequests().antMatchers("/").permitAll()
    .antMatchers("/user/**").hasRole("USER")
    .antMatchers("/go/**").hasRole("ADMIN").and().formLogin()
    .loginPage("/login")
    .and().logout().permitAll();
  }

  @Autowired
	public void configure(AuthenticationManagerBuilder auth, DataSource dataSource, Environment env) throws Exception {
		//if (env.acceptsProfiles("production")) {
			auth.jdbcAuthentication().dataSource(dataSource);
		//}
	}

}
