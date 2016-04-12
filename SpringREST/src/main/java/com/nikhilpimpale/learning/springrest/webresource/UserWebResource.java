package com.nikhilpimpale.learning.springrest.webresource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nikhilpimpale.learning.springrest.dto.User;
import com.nikhilpimpale.learning.springrest.exception.UserNotFoundException;
import com.nikhilpimpale.learning.springrest.service.UserServiceI;

@RestController
@RequestMapping(value = "/users", consumes = "application/json", produces = "application/json")
public class UserWebResource {
	@Autowired
	private UserServiceI userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getUsers() throws UserNotFoundException {
		return new ResponseEntity<List<User>>(userService.fetchUsers(), HttpStatus.OK);
	}
}
