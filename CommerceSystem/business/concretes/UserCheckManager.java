package CommerceSystem.business.concretes;

import CommerceSystem.business.abstracts.UserCheckService;
import CommerceSystem.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	public UserCheckManager() {
		
	}
	
	public void clickToValidate(User user) {
		System.out.println("A verification link has been sent to the email you entered."
				+ " After the verification process is over, the registration will be completed.Email: "+user.getEmail());		
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("The password must be at least 6 characters.Please, correct it");
			return false;
		}else {
			System.out.println("You have made the password according to the required conditions.You can continue with your transaction.");
			return true;
		}
		
	}

	@Override
	public boolean emailRegexCheck(User user) {
		String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if(user.getEmail().matches(emailPattern)==true) {
			return true;
		}else {
		System.out.println("The email entered is incorrect. Please fix it.Email: "+ user.getEmail());
		return false;
		
		}
		
	}

	@Override
	public boolean loginEmailPasswordCheck(User user) {
		
		if(user.getEmail() == user.getEmail() && user.getPassword()==user.getPassword()) {
			return true;
		
	}else {
		return false;
	}
		
		
	}

	@Override
	public boolean nameCheck(User user) {
		if(user.getFirstName().length()<2 || user.getLastName().length() <2 ) {
			System.out.println("The name and surname must be at least 2 characters.Please, correct it.");
			return false;
		}else {
			System.out.println("You have made name and surname according to the required conditions.You can continue with your transaction.");
			return true;
		}
		
	}

}
