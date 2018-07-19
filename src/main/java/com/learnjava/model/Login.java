package com.learnjava.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Login {
	private String username;
	private String password;
}
