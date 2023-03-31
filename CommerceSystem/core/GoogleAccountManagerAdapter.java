package CommerceSystem.core;

import CommerceSystem.accountSystem.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements AccountService {

	@Override
	public void signUpToSystem(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.signUp(message);
		
	}

	@Override
	public void loginToSystem(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.login(message);
		
	}

}
