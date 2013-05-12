package controllers;

import java.util.List;

import models.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import persistence.Repository;

@Controller
public class Settings {
	
	final Logger logger = LoggerFactory.getLogger(Settings.class);	
	
	@Autowired
	protected Repository repository;

	@RequestMapping("/information")
	@Transactional
	public String settings(Model model) {
		logger.info("teste {}", model == null);
		List<User> users = repository.findAllUser();
		model.addAttribute("users", users);
		logger.info("Settings returnin {} users", users.size());
		return "settings/information";
	}
}
