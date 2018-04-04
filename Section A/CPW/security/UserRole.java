package security;
public class UserRole{
    private User user;
    private Role role;
    public UserRole(User user,Role role){
        this.user = user;
        this.role = role;
    }
    public boolean hasRole(User user, Role role){
        return this.user.equals(user.username) && this.role.equals(role.role);
    }
}