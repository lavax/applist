package com.gpteam.applist.module.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gpteam.applist.module.dao.UserDAO;
import com.gpteam.applist.module.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDao;

	public User create(User user) {
		return userDao.save(user);
	}

	public User retrieve(int id) {
		return userDao.findOne(id);
	}

}
