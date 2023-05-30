import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        System.out.println("Digite a quantidade de notas: ");
        int n = entrada.nextInt();
        int resultado = 0;

        while (i <= n){

            System.out.println("Digite o valor das notas: ");
            int notas = entrada.nextInt();

            resultado = resultado + notas;

            i++;

        }

        int media;

        media = resultado / n;

        System.out.println("imprama o valor da media: " + media);

    }
}
