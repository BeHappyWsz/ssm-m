package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserMapper;
import domain.User;
import service.UserService;

@Service
public class UserServicImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	public User getById(int id) {
		return userMapper.getById(id);
	}
	
}
