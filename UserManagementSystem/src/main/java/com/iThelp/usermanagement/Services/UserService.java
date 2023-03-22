package com.iThelp.usermanagement.Services;

import java.util.Map;

import com.iThelp.usermanagement.dto.LoginForm;
import com.iThelp.usermanagement.dto.UnlockAccForm;
import com.iThelp.usermanagement.dto.UserForm;

public interface UserService {
	public String checkEmail(String email);
	
	public Map<Long, String> getCountries();

	public Map<Long, String> getStates(Long countryId);

	public Map<Long, String> getCities(Long stateId);

	public String registerUser(UserForm userForm);

	public String unlockAccount(UnlockAccForm unlockAccForm);

	public String login(LoginForm loginForm);

	public String forgotPwd(String email);
}
