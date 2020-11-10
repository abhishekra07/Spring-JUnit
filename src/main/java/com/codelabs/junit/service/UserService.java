package com.codelabs.junit.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codelabs.junit.entity.Users;
import com.codelabs.junit.utility.Utility;

@Service
public class UserService {
	
	@Autowired
	Utility utility;
	
	Logger logger = LogManager.getLogger(getClass());
	
	public boolean validateUserInfo(Users user) {
		try {
			if(utility.checkForNullValueOrEmptyString(user.getName())) {
				saveUserInfo(user);
			}
		}catch(Exception e) {
			System.out.println("Exception Occured :- "+e.getMessage());
		}
		return true;
	}

	public void saveUserInfo(Users user) {
		logger.debug("This is some debug message");
		System.out.println("This message shoiuld not be printed with @SpyBean");
	}
}
