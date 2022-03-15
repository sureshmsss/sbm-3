package ss.it.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/", "/login", "/home").permitAll().anyRequest().authenticated().and()
				.formLogin().and().oauth2Login()// we develop custom login form having hyper link to login as fb user
				.and().csrf().disable();
	}
}
