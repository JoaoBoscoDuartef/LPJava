package ExemplosDeCodigo;

//Importando a biblioteca de entrada;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        final int NUMEROS_A_LER = 3; //Declaração de uma constante inteira
        Scanner sc = new Scanner(System.in); //Criando o Scanner para a entrada

        //Integer.MAX_VALUE -> Apresenta o valor máximo possível para um int
        //Integer.MIN_VALUE -> Apresenta o valor mínimo possível para um int
        int minimo = Integer.MAX_VALUE, maximo = Integer.MIN_VALUE, entrada;

        for (int i = 0; i < NUMEROS_A_LER; i++) {
            entrada = entrada(sc);
            maximo = valorMaximo(entrada, maximo);
            minimo = valorMinimo(entrada, minimo);
        }

        System.out.println("O maior número é: " + maximo);
        System.out.println("O menor número é: " + minimo);
        sc.close();
    }

    public static int valorMaximo(int entrada, int maximo) {
        if (entrada > maximo) {
            maximo = entrada;
        }

        return maximo;
    }

    public static int valorMinimo(int entrada, int minimo) {
        if  (entrada < minimo){
            minimo = entrada;
        }

        return minimo;
    }

    public static int entrada(Scanner sc) {
        System.out.println("Entre com o número inteiro: ");
        return sc.nextInt();
    }
}