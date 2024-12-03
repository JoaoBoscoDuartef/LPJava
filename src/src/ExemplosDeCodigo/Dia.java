package ExemplosDeCodigo;

/*
 * Imprime o dia da semana correspondendo ao argumento de linha de comando;
 * Entrada via LINHA DE COMANDO
 * *    Exemplo de entrada via linha: java Dia 3
 */

public class Dia {
    public static void main(String[] args) {
        final int DIAS_NA_SEMANA = 7; //Define o número de dias da semana
        final String[] diasDaSemana = {"", "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"}; //define um array diretamente

        //Define se o argumento foi passado, casso contrário, erro de sintaxe
        if (args.length != 1) {
            System.err.println("Sintaxe: Dia numero");
            System.exit(1);
        }

        /*
         * O array args contém todos os valores fornecidos como argumentos.
         * Cada argumento é armazenado como uma string, e seu índice no array corresponde à ordem de entrada.
         */

        //O programa converte o valor da string args (args[0]) em um número inteiro usando Integer.parseInt(args[0]).
        int dia = Integer.parseInt(args[0]);

        //Verifica o intervalo da entrada
        if (dia < 1 || dia > DIAS_NA_SEMANA) {
            System.err.println("O dia da semana deve estar entre 1 e " + DIAS_NA_SEMANA);
            System.exit(1);
        }

        //Exibe o dia correspondente na array
        System.out.println(diasDaSemana[dia]);
    }
}


