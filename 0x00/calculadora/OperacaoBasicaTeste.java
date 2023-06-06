public class OperacaoBasicaTeste {
    public static boolean testar_soma() {
        double a = 5;
        double b = 3;
        if ( a + b == 8){
            return true;
        }else {
            return false;
        }
    }

    public static boolean testar_subtracao() {
        double a = 5;
        double b = 3;
        if ( a - b == 2){
            return true;
        }else {
            return false;
        }
    }

    public static boolean testar_multiplicacao() {
        double a = 5;
        double b = 3;
        if ( a * b == 15){
            return true;
        }else {
            return false;
        }
    }

    public static boolean testar_divisao () {
        double a = 9;
        double b = 3;
        if ( a / b == 3){
            return true;
        }else {
            return false;
        }
    }
}
