public class User {
    private int userId;
    private String userName;
//Adding the fields
    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
//Adding the constructor
    public int getUserId() {
        return userId;
    }
//Adding getter and setter methods
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
