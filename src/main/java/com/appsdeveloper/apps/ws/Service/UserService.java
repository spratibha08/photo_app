package com.appsdeveloper.apps.ws.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdeveloper.apps.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
}