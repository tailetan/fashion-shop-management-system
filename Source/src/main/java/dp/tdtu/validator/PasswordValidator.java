
package dp.tdtu.validator;

import dp.tdtu.model.User;
import dp.tdtu.repo.UserRepository;
import dp.tdtu.singletonlogger.SingletonLogger;

public class PasswordValidator implements LoginValidator<User> {
    UserRepository userRepo = new UserRepository();
    
    @Override
    public boolean validate(User user) {
        User foundUser = userRepo.findUserByUsername(user.getUsername());
        if(!foundUser.getPassword().equals(user.getPassword())){
            SingletonLogger.getInstance().log("Password is incorrect");
            return false;
        }
        return true;
    }
    
}
