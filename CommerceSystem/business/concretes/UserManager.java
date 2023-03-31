package CommerceSystem.business.concretes;

import java.util.List;


import CommerceSystem.business.abstracts.UserService;
import CommerceSystem.core.AccountService;
import CommerceSystem.dataAccess.abstracts.UserDao;
import CommerceSystem.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	private UserCheckManager userCheckManager;
	
	private AccountService accountService;
	
	
	
	
	public UserManager(UserDao userDao, AccountService accountService,UserCheckManager userCheckManager) {
		
		this.userDao = userDao;
		this.accountService = accountService;
		this.userCheckManager = userCheckManager;
	}
	
	
	@Override
	public void register(User user) {
		if(this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.passwordCheck(user) && this.userCheckManager.nameCheck(user)) {
			this.userCheckManager.clickToValidate(user);
			System.out.println("-----------------");
			
			System.out.println("Email verification was successful.You signed up under the following name: "+ user.getFirstName()+" "+user.getLastName());
			this.userDao.add(user);
			this.accountService.signUpToSystem(user.getEmail());
		}else {
			System.out.println("Registration failed.Please check the information you have entered.");
		}
		System.out.println("-----------------");
		
	}

	@Override
	public void login(User user) {
		if(this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.loginEmailPasswordCheck(user)) {
			this.userDao.add(user);
			this.accountService.loginToSystem(user.getEmail());
		}else {
			System.out.println("Login failed.Please check the information you have entered.");
		}
		System.out.println("-----------------");
		
	}
		
		
		
		
	
	@Override
	public void deleteAccount(User user) {
		if(this.userCheckManager.emailRegexCheck(user) && this.userCheckManager.loginEmailPasswordCheck(user)) {
			this.userDao.delete(user);
			System.out.println("The account linked to this e-mail will be deleted: "+user.getEmail());
		}else {
			System.out.println("Login failed.Please check the information you have entered.");
		}
		System.out.println("-----------------");
		
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	

}
