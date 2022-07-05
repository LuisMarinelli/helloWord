import javax.naming.spi.DirStateFactory.Result;

public class App {
    public static void main(String[] args) throws Exception {
        int num = -10;
        String result = "";

        if( num >= 0 ){
            result = "Positivo";
        } else {
            result = "Negativo";
        }

        System.out.println("Hello, World! O número informado é " + result + ".");
    }
}
