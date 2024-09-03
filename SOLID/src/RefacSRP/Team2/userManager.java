package RefacSRP.Team2;

public class userManager {
    private User[] users = new User[10];
    private int userCount = 0;

     public void registerUSer(String userName, String password) {
        if (userCount < users.length) {
            users[userCount] = new User (userName, password);
        } else {
            System.out.println("Usuario no registrado");
        }
    }

    public User getUser(String userName) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserName().equals(userName)) {
                return users[i];
            }
        }
        return null;
    }
}
