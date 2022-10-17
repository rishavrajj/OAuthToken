package com.OAuthToken.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OAuthToken.Models.UserModel;
import com.OAuthToken.Services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService courseServices;
	
	@GetMapping("/users")
	public List<UserModel> getUsers(){
		return this.courseServices.getUsers();
	}
}
