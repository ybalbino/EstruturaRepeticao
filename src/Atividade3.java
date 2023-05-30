import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

/*        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int resultado;

        System.out.println("Digite um numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero2 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero3 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero4 = entrada.nextInt();
        System.out.println("Digite um numero: ");
        numero5 = entrada.nextInt();

        resultado = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.println("O somatorio dos numeros é de: " + resultado);*/

        int resultado = 0;
        for (int i = 1; i <= 5; i ++) {
            System.out.println("Digite um numero: ");
            int numero = entrada.nextInt();

            resultado = resultado + numero;

        }
        System.out.println("O somatorio dos numeros é de: " + resultado);

    }
}
