package com.m2i.formation.service;

import com.m2i.formation.dao.entity.User;

public interface IUserService {
	
	User getLoggedUser(String username, String Password);
	
	
	

}
