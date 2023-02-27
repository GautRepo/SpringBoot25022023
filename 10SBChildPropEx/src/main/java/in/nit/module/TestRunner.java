package in.nit.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class TestRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private int id;
	@Value("${my.app.name}")
	private String name;
	/*
	 * @Value("${my.app.db}") private String db;
	 */
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
