package in.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import in.nit.module.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
@ConfigurationProperties("my.app")
public class MyRunner implements CommandLineRunner {
	
	private Product prod;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
