public class UserManager {
    public void Login( User user){
        System.out.println(user.getUsername() +"   Welcome to the website");
    }

    public void Course(User user){
        System.out.println(user.getEmail()+"  Mail has been sent to your account ");
    }

    public void Logout(User user){
        System.out.println(user.getUsername()+"  Goodbye");
    }
}
