package com.m2i.formation.presentation;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.m2i.formation.dao.entity.User;
import com.m2i.formation.service.IUserService;

@Controller
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Resource(name = "userService")
	private IUserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("IN : userAcceuil");
		model.addAttribute("loggedUser", new User());
		return "userAcceuil";
	}

	@RequestMapping(value = "/loginAction")
	public String loginAction(User loggedUser, Model model) {
		logger.info("IN loginAction -- utilisateur : " + loggedUser.getLogin());
		loggedUser = userService.getLoggedUser(loggedUser.getLogin(), loggedUser.getPassword());
		if (loggedUser == null) {
			model.addAttribute("message", "login ou mot de passe incorrect");
			model.addAttribute("loggedUser", new User());

		} else {

			model.addAttribute("message", "");
			model.addAttribute("loggedUser", loggedUser);
			if (loggedUser.getRole().equals("ADMIN")) {
				model.addAttribute("user", new User());
				// model.addAttribute("users",userService.getAllUser());
			}
		}

		return "userAcceuil";
	}

	@RequestMapping(value = "/disconnect", method = RequestMethod.GET)
	public String disconnect(Model model) {
		logger.info("IN disconnect: ");
		model.addAttribute("message", "Vous avez bien été deconnecté ! A Bientôt ! ");
		model.addAttribute("loggedUser", new User());
		return "userAcceuil";
	}

}
