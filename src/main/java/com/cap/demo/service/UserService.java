package com.cap.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.model.User;
import com.cap.demo.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User insert(User user) {
		// TODO Auto-generated method stub
		if (user.getUserid() != null) {
			return null;
		}
		User saveUser = userRepository.save(user);
		return saveUser;
	}

	public User findByUserId(Long userid) {
		// TODO Auto-generated method stub
		return userRepository.findOne(userid);
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		User u = userRepository.findOne(user.getUserid());
		if (u == null) {
			return null;
		}
		User update = userRepository.save(user);
		return update;

	}

	public void delete(Long userid) {
		// TODO Auto-generated method stub
		userRepository.delete(userid);

	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
