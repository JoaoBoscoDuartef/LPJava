package ExemplosDeCodigo;
import java.util.Scanner;

public class Multiplos {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (b > a) {
            if ((b % a) == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao Sao Multiplos");
            }
        } else {
            if ((a % b) == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao Sao Multiplos");
            }
        }

        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }

    }

}
