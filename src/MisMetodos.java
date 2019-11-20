import java.util.Scanner;

public class MisMetodos {

    public static float validaFloatPositivo() {
        Scanner sc = new Scanner(System.in);
        float valor;

        do {
            valor = sc.nextFloat();
        } while (valor <= 0);
        return valor;

    }

}
