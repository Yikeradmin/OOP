package entry;

/**
 * @author: CoolPro
 * @Desc:
 * @create: 2024-01-22 15:12
 **/

public class User {
    String username;
    String password;
    long userId;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public User() {
    }

    public User(String username, String password, long userId) {
        this.username = username;
        this.password = password;
        this.userId = userId;
    }
}
