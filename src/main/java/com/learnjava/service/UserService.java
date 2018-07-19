package com.learnjava.service;

import com.learnjava.model.Login;
import com.learnjava.model.User;

public interface UserService {
	public User validateUser(Login login);
}
