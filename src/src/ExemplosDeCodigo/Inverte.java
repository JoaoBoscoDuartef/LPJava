package ExemplosDeCodigo;

// Ler 10 números inteiros da entrada, imprimir em ordem inversa

import java.util.Scanner;

public class Inverte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; //Criação de uma array de 10 inteiros

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira um número: ");
            numeros[i] = sc.nextInt(); //Atribuindo a array a entrada do usuário
        }

        for (int i = 10 - 1; i >= 0; i--) {
            System.out.println(numeros[i] + " ");
        }
        sc.close();
    }
}
