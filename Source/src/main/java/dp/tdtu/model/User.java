
package dp.tdtu.model;

public class User {
    String username;
    String password;
    String fullName;
    
    public User(String username, String password, String fullName){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return this.password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    
}
