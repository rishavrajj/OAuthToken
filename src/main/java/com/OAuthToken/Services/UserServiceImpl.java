package com.OAuthToken.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.OAuthToken.Models.UserModel;

@Service
public class UserServiceImpl implements UserService {
	List<UserModel> list;
	
	public UserServiceImpl() {
		list = new ArrayList<>();
		list.add(new UserModel("Rishav", "Rish"));
		list.add(new UserModel("Prashant","Paro"));		
	}
	
	@Override
	public List<UserModel> getUsers(){
		return list;
	}	
}
