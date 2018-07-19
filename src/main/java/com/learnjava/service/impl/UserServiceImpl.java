package com.learnjava.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.learnjava.exception.UserNotFoundException;
import com.learnjava.model.Login;
import com.learnjava.model.Role;
import com.learnjava.model.User;
import com.learnjava.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Override
	public User validateUser(Login login) {
		User user = null;
		if ("Rakesh".equals(login.getUsername())) {
			user = new User();
			Set<Role> roles = new HashSet<>();
			Role role = new Role();
			// can call dao layer
			// set user details
			user.setUserId(449664);
			user.setAccountNonExpired(true);
			user.setAccountNonLocked(true);
			user.setCredentialsNonExpired(true);
			user.setEnabled(true);
			role.setRoleId(1);
			role.setRole("ROLE_ADMIN");
			roles.add(role);
			role.setRoleId(2);
			role.setRole("ROLE_USER");
			roles.add(role);
			user.setRoles(roles);
		} else {
			throw new UserNotFoundException("User with name : " + login.getUsername() + " Not found");
		}
		return user;
	}

}
