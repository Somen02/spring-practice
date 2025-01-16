package designPattern.builderDp;

public class User {

    private final String userId;
    private final String userName;

    public User(UserBuilder userBuilder){
        this.userId=userBuilder.userId;
        this.userName=userBuilder.userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    static class UserBuilder{
        private  String userId;
        private  String userName;

        public UserBuilder(){

        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
