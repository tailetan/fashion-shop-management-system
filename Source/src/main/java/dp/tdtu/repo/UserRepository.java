package dp.tdtu.repo;

import java.util.Arrays;
import java.util.List;

import dp.tdtu.model.User;



public class UserRepository {
    public static List<User> users = Arrays.asList(
    		new User("518H0114", "518H0114", "Le Tan Tai"),
    		new User("518H0616", "518H0616", "Phan An Duy"),
    		new User("admin", "admin", "Admin")
    		
    		);
    
    public List<User> findAllUsers(){
        return users;
    }
    
    public User findUserByUsername(String username){
        for (User user : users) {
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
