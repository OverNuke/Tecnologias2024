package RefacSRP.Team2;

public class Authenticator {


    public boolean authenticateUser(userManager usMan, String userName, String password) {
        User us = usMan.getUser(userName);
        if (us != null && us.getPassword().equals(password)) {
            System.out.println("Usuario encontrado");
            return true;
        } else {
            System.out.println("Usuario no encontrado");
            return false;
        }
    }
}
