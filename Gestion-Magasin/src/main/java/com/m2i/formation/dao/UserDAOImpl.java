package com.m2i.formation.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.m2i.formation.dao.entity.User;

@Repository
public class UserDAOImpl implements IUserDAO {

	
	@Resource(name="hibernate5AnnotationSessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public User getUser(User u) {
		Session session = sessionFactory.openSession();
		User pResult =null;
		if ( u.getId() != 0) {
			pResult = session.get(User.class, u.getId());
		} else {
			pResult = (User) session.createQuery("FROM User WHERE lower(login) = :param")
					.setParameter("param", u.getLogin().toLowerCase())
					.uniqueResult();
			session.close();
			return pResult;
		}
		
		return null;
	}

}
