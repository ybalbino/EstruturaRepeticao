import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantidade de pessoas na fila: ");
        int fila = entrada.nextInt();

        do {
            System.out.println("Agora temos" + fila + "cliente");
            fila--;
        } while (fila > 0);

        System.out.println("Fila zerado!");
    }
}
