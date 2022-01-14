package dp.tdtu.validator;

import dp.tdtu.model.User;
import dp.tdtu.singletonlogger.SingletonLogger;

public class InputCredentialsValidator implements LoginValidator<User> {

    @Override
    public boolean validate(User user) {
        if(user.getUsername()== null 
                || user.getPassword() == null
                || user.getUsername().isEmpty()
                || user.getPassword().isEmpty()
                || user.getUsername().contains(" ")
                || user.getPassword().contains(" ")){
            SingletonLogger.getInstance().log("The user name and password are not following the restrictions");
            return false;
        }
        return true;
    }
}
