package security;
public class User{
    private static int max=0;
    private int id;
    public String username;
    public String password;
    public User(String username, String password){
        id = ++max;
        this.username = username;
        this.password = password;
    }
    public boolean equals(String username){
       return this.username == username;
    }
    public boolean equals(User user){
        return this.username == user.username;
     }
    public int getId(){
        return id;
    }
}