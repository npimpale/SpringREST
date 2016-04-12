package com.nikhilpimpale.learning.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nikhilpimpale.learning.springrest.dto.User;
import com.nikhilpimpale.learning.springrest.exception.UserNotFoundException;

@Service("userService")
public class UserService implements UserServiceI {

	@Override
	public List<User> fetchUsers() throws UserNotFoundException {
		List<User> users = new ArrayList<User>();
		User u1 = new User(1, "nikhilpimpale");
		User u2 = new User(2, "kunalpimpale");
		users.add(u1);
		users.add(u2);
		return users;
	}

}
