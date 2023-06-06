public class Pessoa {

    public static boolean emailValid(String email){
        if (email.contains("@")) {
            return true;
        }else if (email.length() <= 50){
            return true;
        } else {
            return false;
        }
    }
}