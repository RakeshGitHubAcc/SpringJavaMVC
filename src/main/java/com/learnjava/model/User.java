package com.learnjava.model;

import java.util.Set;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class User {
	private Integer userId;
	private String username;
	private String password;
	private Boolean enabled;
	private Boolean AccountNonExpired;
	private Boolean accountNonLocked;
	private Boolean credentialsNonExpired;
	private Set<Role> roles;
	
}
