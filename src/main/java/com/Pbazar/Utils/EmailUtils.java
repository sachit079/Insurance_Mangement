package com.Pbazar.Utils;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtils {

	@Autowired
	private JavaMailSender mailSender;
	
	public boolean sendEmail(String sub, String body,String to ,File f) throws Exception{
		
		MimeMessage mimeMsg = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMsg,true);
		helper.setSubject(sub);
		helper.setText(body,true);
		helper.setTo(to);
		helper.addAttachment("Report-2025", f);
		
		mailSender.send(mimeMsg);
		
		return true;
	}
}
