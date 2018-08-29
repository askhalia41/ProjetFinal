package fr.m2i.formation.presentation;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.m2i.formation.dao.entity.User;

public class UserController {
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("IN: userAccueil");
		model.addAttribute("loggedUser", new User());
		return "userAccueil";
	}
	
	@RequestMapping(value="/loginAction", method=RequestMethod.GET)
	public String loginAction(User loggedUser, Model model) {
		logger.info("IN: loginAction");
		model.addAttribute("loggedUser", new User());
		return "loginAction";
	}
}
