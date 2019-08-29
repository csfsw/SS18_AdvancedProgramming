package security;
public class Role{
    private static int max=0;
    private int id;
    public String role;
    public Role(String role){
        id=++max;
        this.role = role;
    }
    public boolean equals(String role){
        return this.role == role;
    }
    public boolean equals(Role role){
        return this.role == role.role;
    }
    public int getID(){
        return id;
    }
    public Role getRole(String role){
        return this;
    }
}