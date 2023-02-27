package in.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("msg")
public class MsgAlert implements AlterService {

	@Override
	public void showMsg() {
		System.out.println("MsgAlert.showMsg()");

	}

}
