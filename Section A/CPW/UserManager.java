package security;
import java.util.Map;

import java.util.Optional;
import security.User;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class UserManager{
    private static final Map<Integer,User> users= new HashMap<Integer,User>();
    private static final Map<Integer,Role> roles = new HashMap<Integer,Role>();
    private static final Map<Integer,User> logedinuser = new HashMap<Integer,User>();
    private static final List<UserRole> usersroles = new ArrayList<UserRole>();
    public UserManager(){
        User user1=new User("ahmad","123456");
        users.put(user1.getId(),user1);
        Role role1 = new Role("Admin");
        roles.put(role1.getID(),role1);
        usersroles.add(new UserRole(user1,role1));
    }
    public boolean register(String username, String password){
        //boolean existslmbda = users.values().stream().anyMatch(u-> u.username == username); 
        boolean exists = false;
            for(User user:users.values()){
                if(user.equals(username)){
                    exists =true;
                    break;
                }
            }
            if(exists){
                return false;
            }else{
                User user=new User(username,password);
                users.put(user.getId(),user);
                return true;
            }
    }
    public boolean login(String username, String password){
        boolean loggedin = false;
        for(User user: logedinuser.values()){
                if(user.equals(username)){
                    loggedin = true;
                    break;
                }
        }
        if(!loggedin){
            Optional<User> user = users.values().stream().filter(u-> u.username==username && u.password == password).findFirst();
            User usr = user.orElse(null);
            if(usr!=null){
                logedinuser.put(usr.getId(),usr);
                loggedin = true;
            }
        }
        return loggedin;
    }
}