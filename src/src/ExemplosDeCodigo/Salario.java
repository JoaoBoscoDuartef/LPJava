//https://judge.beecrowd.com/pt/problems/view/1008
package ExemplosDeCodigo;
import java.util.Scanner;

public class Salario {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroFuncionario, horasTrabalhadas;
    double valorHora, salario;

    numeroFuncionario = sc.nextInt();
    horasTrabalhadas = sc.nextInt();
    valorHora = sc.nextDouble();

    salario = horasTrabalhadas * valorHora;
    System.out.println("NUMBER = " + numeroFuncionario);
    System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
