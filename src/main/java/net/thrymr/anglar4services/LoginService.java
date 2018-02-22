package net.thrymr.anglar4services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.thrymr.anglar4services.bean.CoinResponse;
import net.thrymr.anglar4services.bean.LoginBean;
import net.thrymr.anglar4services.model.AppUser;
import net.thrymr.anglar4services.repo.impl.AppUserRepository;

@Service
public class LoginService {

	@Autowired
	AppUserRepository appUserRepository;
	
	public CoinResponse login(LoginBean loginBean){
		
		System.out.println(loginBean.userName + "---- "+  loginBean.password);
		
	AppUser appUser	= appUserRepository.findByNameAndPassword(loginBean.userName, loginBean.password);
		
	System.out.println("appUser : "+appUser);
	
	if(appUser != null){	
		
		return new CoinResponse(Boolean.TRUE, appUser);
	}
	
	return new CoinResponse(Boolean.FALSE);
	}

	public CoinResponse register(LoginBean loginBean) {
		
		AppUser appUser = new AppUser();
		
		appUser.name = loginBean.name;
		appUser.email = loginBean.email;
		appUser.password = loginBean.password;
		
		appUserRepository.save(appUser);
		
		return new CoinResponse(Boolean.TRUE, "Success");
	}

	public CoinResponse getAppUserList() {
		
		return new CoinResponse(Boolean.TRUE, appUserRepository.findAll());
	}

	public CoinResponse deleteUser(Long userId) {
		AppUser appUser = appUserRepository.findOne(userId);
		try {
			appUserRepository.delete(appUser);
			return new CoinResponse(Boolean.TRUE, appUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new CoinResponse(Boolean.FALSE,"something went wrong");
	}
	
}
