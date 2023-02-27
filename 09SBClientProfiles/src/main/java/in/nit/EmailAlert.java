package in.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class EmailAlert implements AlterService {

	@Override
	public void showMsg() {
		System.out.println("EmailAlert.showMsg()");

	}

}
