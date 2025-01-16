package designPattern.builderDp;

public class Client {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("100")
                .setUserName("Somen")
                .build();
        System.out.println(user);

        User user2 = User.UserBuilder
                .builder()
                .setUserId("100")
                .setUserName("Somen")
                .build();
    }
}
