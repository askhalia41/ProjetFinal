package com.m2i.formation.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.m2i.formation.dao.IUserDAO;
import com.m2i.formation.dao.entity.User;
import com.m2i.formation.util.EncryptUtil;

public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDAO userDAO;
	
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	
	@Override
	public User getLoggedUser(String username, String password) {

		logger.info("In > getLoggedUser ( " + username + ", " + password + " )");
		User u = new User();
		u.setLogin(username);
		u = userDAO.getUser(u);
		
		boolean isLogged = false;
		if (u!=null) isLogged = EncryptUtil.checkHashedPwd(password,u.getPassword());
		logger.info("Out < getLoggedUser");
		
		if (isLogged) return u;
		else return null;
		
			}
	
	
}
