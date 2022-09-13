package com.revature.services;

import com.revature.dto.UserDto;
import com.revature.models.User;

public interface UserServiceInterface {
	User convertUserDto(UserDto userDto);
}
