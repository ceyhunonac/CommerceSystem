package CommerceSystem.business.abstracts;

import CommerceSystem.entities.concretes.User;

public interface UserCheckService {
	

	void clickToValidate(User user);
	boolean passwordCheck(User user);
	boolean emailRegexCheck(User user);
	boolean loginEmailPasswordCheck(User user);
	boolean nameCheck(User user);

}
