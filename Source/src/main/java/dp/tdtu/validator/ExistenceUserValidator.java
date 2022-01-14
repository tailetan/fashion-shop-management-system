package dp.tdtu.validator;

import dp.tdtu.model.User;
import dp.tdtu.repo.UserRepository;
import dp.tdtu.singletonlogger.SingletonLogger;

public class ExistenceUserValidator implements LoginValidator<User> {

    UserRepository userRepo = new UserRepository();
    
    @Override
    public boolean validate(User user) {
        User foundUser = userRepo.findUserByUsername(user.getUsername());
        if(foundUser == null){
            SingletonLogger.getInstance().log("User does not exist " + user.getUsername());
            return false;
        }
        return true;
    }
    
}
