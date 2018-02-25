package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IUserDao;
import com.cg.dto.UserBean;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao dao;
	
	public UserBean insertNewUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.insertNewUser(user);
	}

}
