package com.nikhilpimpale.learning.springrest.service;

import java.util.List;

import com.nikhilpimpale.learning.springrest.dto.User;
import com.nikhilpimpale.learning.springrest.exception.UserNotFoundException;

public interface UserServiceI {
	public List<User> fetchUsers() throws UserNotFoundException;

}
