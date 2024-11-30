package ExemplosDeCodigo;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        final double QUANTIA_MINIMA_TOTAL = 10000;
        final double MENOR_CONTRIBUICAO = 200;

        System.out.print("Quanto dinheiro voce quer para se aposentar? ");
        //Verifica se o valor é maior que a quantia mínima definida na constante
        double alvo = recebeDoubleMaiorQue(QUANTIA_MINIMA_TOTAL);

        System.out.print("Quanto dinheiro voce vai contribuir todo ano?");
        double contribuicaoAnual = recebeDoubleMaiorQue(MENOR_CONTRIBUICAO);

        System.out.print("Taxa de juros (ex.: digite 0,075 para 7,5%): ");
        double juros = recebePercentual();

        System.out.println("Voce pode se aposentar em " + computaAnosDeContribuicao(alvo, contribuicaoAnual, juros) + " anos.");
    }

    private static int computaAnosDeContribuicao(double alvo, double contribuicao, double juros) {
        int anos = 0;
        double saldo = 0;

        while (saldo < alvo) {
            saldo = (saldo + contribuicao) * (1 + juros);
            anos++;
        }

        return anos;
    }

    private static double recebePercentual() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Voce deve digitar um valor real entre 0 e 1.");
            return recebePercentual();
        }

        double valor = sc.nextDouble();
        if (valor > 1 || valor < 0) {
            System.out.println(" Voce deve digitar um valor real entre 0 e 1.");
            return recebePercentual();
        }

        return valor;
    }

    //Metodo de verificação de entrada maior que o mínimo
    private static double recebeDoubleMaiorQue(double minimo) {
        Scanner sc = new Scanner(System.in); //Importa o Scanner

        //Verifica se o valor de entrada é um double ou não
        if (!sc.hasNextDouble()) {
            sc.next(); //se não for, descarta o token de entrada
            System.out.println("Voce deve digitar um valor real maior que " + minimo);
            return recebeDoubleMaiorQue(minimo); // chama o metodo recusivamente para continuar scaneando e verificando
        }

        //verifica se o valor é menor ou não que minimo
        double valor = sc.nextDouble();
        if (valor < minimo) {
            System.out.println("Voce deve digitar um valor real maior que " + minimo);
            return recebeDoubleMaiorQue(minimo);
        }

        return valor;
    }
}
