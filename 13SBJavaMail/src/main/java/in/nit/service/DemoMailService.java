package in.nit.service;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class DemoMailService {

	@Autowired
	private JavaMailSender sender;
	
	public boolean sendMail(String to, String[] cc, String[] bcc,String sub, String text, Resource file) {
		boolean flag = false;
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, file !=null?true:false);
			helper.setTo(to);
			helper.setSubject(sub);
			helper.setText(text);
			if(cc !=null && cc.length>0)
				helper.setCc(cc);
			if(bcc !=null && bcc.length>0)
				helper.setBcc(bcc);
			if(file !=null )
				helper.addAttachment(file.getFilename(), file);
			sender.send(message);
			flag=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
