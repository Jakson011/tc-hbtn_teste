public class Person {

    public static boolean checkUser(String usuario){
        boolean contains = !usuario.contains("(?=.[}{,.^?~=+\\\\-_\\\\/\\\\-+.\\\\|])(?=.*[0-9]).{8,}\")");
        if (usuario.length() >= 8 && contains){
            return true ;
        }
        return false;
    }

    public static boolean checkPassword(String password){
        if (password.matches("(?=.[}{,.^?~=+\\-_\\/\\-+.\\|])(?=.[a-zA-Z])(?=.[0-9]).{8,}")){
            return true ;
        }
        return false;
    }
}
