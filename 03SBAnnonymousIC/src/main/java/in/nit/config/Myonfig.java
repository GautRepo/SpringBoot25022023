package in.nit.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myonfig {

	@Bean
	public CommandLineRunner myBean() {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Myonfig.myBean().new CommandLineRunner() {...}.run()");
			
			}
		};
	}
}
