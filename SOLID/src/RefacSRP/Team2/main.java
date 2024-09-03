package RefacSRP.Team2;



public class main {
    public static void main(String[] args) {
        userManager userManager = new userManager();

        userManager.registerUSer("Magdiel","mag");
        userManager.registerUSer("Alejandro","teran");

        Authenticator authenticator = new Authenticator();

        authenticator.authenticateUser(userManager,"Magdiel","mag");
        authenticator.authenticateUser(userManager,"Teran","mag");
    }
}
