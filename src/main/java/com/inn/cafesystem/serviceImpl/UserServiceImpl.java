package com.inn.cafesystem.serviceImpl;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.inn.cafesystem.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public ResponseEntity<String> signUp(Map<String, String> requestMap) {
		return null;
	}

}
