package cimap.recursos_humanos.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"cimap"})
@ServletComponentScan
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableAsync
public class CimapApi {

	public static void main(String[] args) {
		SpringApplication.run(CimapApi.class, args);
	}
}
