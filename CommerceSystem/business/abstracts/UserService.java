package CommerceSystem.business.abstracts;

import java.util.List;

import CommerceSystem.entities.concretes.User;


public interface UserService {
	
	 void register(User user);
	 
	 void login(User user);
	 
	 void deleteAccount(User User);
	
	 List<User> getAll();

}
