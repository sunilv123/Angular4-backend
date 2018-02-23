package net.thrymr.anglar4services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.thrymr.anglar4services.LoginService;
import net.thrymr.anglar4services.bean.CoinResponse;
import net.thrymr.anglar4services.bean.LoginBean;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	LoginService loginService;
	
	@PostMapping("/login")
	public CoinResponse login(@RequestBody LoginBean loginBean){
		return loginService.login(loginBean);
	}
	
	
	@PostMapping("/register")
	public CoinResponse register(@RequestBody LoginBean loginBean){
		return loginService.register(loginBean);
	}
	
	@GetMapping("/get-appuser-list")
	public CoinResponse getAppUserList(){
		return loginService.getAppUserList();
	}

	@GetMapping("/delete-user/{userId}")
	public CoinResponse deleteUser(@PathVariable("userId") Long userId){
		return loginService.deleteUser(userId);
	}
	
	@PostMapping("/edit-user/{userId}")
	public CoinResponse editUser(@RequestBody LoginBean loginBean){
		return loginService.editUser(loginBean);
	}

	
}
