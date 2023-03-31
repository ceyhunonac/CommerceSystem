package CommerceSystem.dataAccess.abstracts;

import java.util.List;

import CommerceSystem.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);	
	User get(int userId);
	List<User> getAll();

}
