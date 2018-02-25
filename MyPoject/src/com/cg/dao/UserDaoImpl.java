package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.dto.UserBean;

@Repository
public class UserDaoImpl implements IUserDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public UserBean insertNewUser(UserBean user) {
		System.out.println("in DAO =>"+user);
		
		entityManager.persist(user);
		
		System.out.println("in DAO data inserted");
		return user;
	}
}


