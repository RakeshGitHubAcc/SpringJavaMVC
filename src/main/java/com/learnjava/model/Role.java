package com.learnjava.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Role {
	private Integer roleId;
	private String role;
}
