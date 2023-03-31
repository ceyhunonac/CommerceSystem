package CommerceSystem.dataAccess.concretes;

import java.util.List;

import CommerceSystem.dataAccess.abstracts.UserDao;
import CommerceSystem.entities.concretes.User;

public class DatabaseUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Added to default database: "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Removed from the default database: "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated default database: "+user.getFirstName());
		
	}

	@Override
	public User get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
