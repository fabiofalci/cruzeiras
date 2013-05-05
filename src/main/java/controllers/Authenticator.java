package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Authenticator {
	
	final Logger logger = LoggerFactory.getLogger(Authenticator.class);
	
	@RequestMapping(value = "/home") 
	public String authenticate(String email, String password) {
		logger.info("Authenticating '{}'", email);
		return "work";
	}
	
}
