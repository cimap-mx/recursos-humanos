package cimap.recursos_humanos.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 

		http
		.csrf().disable()
		.authorizeRequests().antMatchers("/seguridad/iniciar/sesion").permitAll()
		.antMatchers("/recursosHumanos/personal/empleados/porCurp/*").permitAll()
		.antMatchers("/recursosHumanos/personal/usuario/guardar").permitAll()
		.antMatchers("/recursosHumanos/personal/unidades/*").permitAll()
		.antMatchers("/recursosHumanos/personal/unidades/eliminar/*").permitAll()
		.antMatchers("/recursosHumanos/personal/unidades/elementosPadre/*").permitAll()
		.anyRequest()
		.authenticated()
		.and()		
		.exceptionHandling()
		.and()
		.sessionManagement();		
		super.configure(http);
	}
	
		
	@Bean
	PasswordEncoder passwordEncoderLocal() {
		return new BCryptPasswordEncoder();
	}
	
	

}
