package com.codelabs.junit;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codelabs.junit.entity.Users;
import com.codelabs.junit.service.UserService;
import com.codelabs.junit.utility.Utility;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	@SpyBean
	UserService userService;
	
	@MockBean
	Utility utility;
	
	@Test
	public void testValidateUserInfo() {
		Users user = new Users();
		user.setName("Abhishek Rathore");
		
		//Mock utility service
		when(utility.checkForNullValueOrEmptyString(Mockito.anyString())).thenReturn(true);
		//mock this call for save class where we ahve actual call
		doNothing().when(userService).saveUserInfo(Mockito.any(Users.class));
		userService.validateUserInfo(user);
	}

}
