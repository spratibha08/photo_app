package com.appsdeveloper.apps.ws.Service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.appsdeveloper.apps.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService{
	UserDto createUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String userId);
	UserDto updateUser(String userID, UserDto user);
	void deleteUser(String userId);
	List<UserDto> getUsers(int page, int limit);
}
