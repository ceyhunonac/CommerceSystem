package CommerceSystem;


import CommerceSystem.accountSystem.GoogleAccountManager;
import CommerceSystem.business.abstracts.UserService;
import CommerceSystem.business.concretes.UserCheckManager;
import CommerceSystem.business.concretes.UserManager;
import CommerceSystem.core.GoogleAccountManagerAdapter;
import CommerceSystem.dataAccess.concretes.DatabaseUserDao;
import CommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Ceyhun","Onaç","ceyhunonc@gmail.com","123913");
		
		UserService userService = new UserManager(new DatabaseUserDao(),new GoogleAccountManagerAdapter(),new UserCheckManager());
		userService.register(user1);
		userService.deleteAccount(user1);
		userService.login(user1);
		
		

	}

}
