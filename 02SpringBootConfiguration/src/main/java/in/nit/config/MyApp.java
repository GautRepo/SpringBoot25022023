package in.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.nit.runner.MyRunner;

@Configuration
public class MyApp {

	@Bean
	public MyRunner runner() {
		return new MyRunner();
	}
}
