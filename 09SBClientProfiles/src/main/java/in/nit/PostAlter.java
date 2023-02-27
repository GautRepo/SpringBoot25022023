package in.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("post")
public class PostAlter implements AlterService {
	@Override
	public void showMsg() {
		System.out.println("PostAlter.showMsg()");

	}
}
