// https://judge.beecrowd.com/pt/problems/view/1048
package ExemplosDeCodigo;
import java.util.Scanner;

public class AumentoSalario {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = entradaSalario(sc);
        int percentual = intervaloDeSalario(salario);
        double novoSalario = novoSalario(percentual, salario);
        double reajuste = reajuste(novoSalario, salario);

        print(novoSalario, reajuste, percentual);
    }

    private static double entradaSalario (Scanner sc) {
        return sc.nextDouble();
    }

    private static int intervaloDeSalario(double salario) {
        if (salario >= 0 && salario <= 400) {
            return 15;

        } else if (salario > 400 && salario <= 800) {
            return 12;

        } else if (salario > 800 && salario <= 1200) {
            return 10;

        } else if (salario > 1200 && salario <= 2000) {
            return 7;

        } else {
            return 4;
        }
    }

    private static double novoSalario(double percentual, double salario) {
        return ((percentual/100) + 1) * salario;
    }

    private static double reajuste (double novoSalario, double salario) {
        return novoSalario - salario;
    }

    private static void print (double novoSalario, double reajuste, int inteiro) {
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + inteiro + " %");
    }
}