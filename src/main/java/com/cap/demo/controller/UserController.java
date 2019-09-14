package com.cap.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.model.User;
import com.cap.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userservice;

	@RequestMapping(value = "/user/insert", method = RequestMethod.POST, headers = "Accept-application/json")
	public User addUser(User user) {
		return userservice.insert(user);
	}

	@RequestMapping(value = "/updateuser/{userid}")
	public User updateUser(@PathVariable("userid") User userid) {
		return userservice.update(userid);
	}

	@RequestMapping(value = "/deleteuser/{userid}", method = RequestMethod.DELETE)
	public void delUser(@PathVariable("userid") Long userid) {
		userservice.delete(userid);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<User> findUsers() {
		return userservice.findAll();
	}

	@RequestMapping(value = "/finduser/{userid}", method = RequestMethod.GET)
	public User findOne(@PathVariable("userid") Long userid) {
		return userservice.findByUserId(userid);
	}

}
