package ExemplosDeCodigo;

import java.util.Arrays;
import java.util.Scanner;

public class Intercala {
    public static void main(String[] args) {
        final int TAMANHO_VETOR_MAX = 10;
        final int TAMANHO_VETOR_MIN = 1;
        final int BASE_VETOR_UM = 2;
        final int BASE_VETOR_DOIS = 7;

        int tamanhoVetorUm = verificarTamanho("Insira o tamanho do primeiro vetor: ", TAMANHO_VETOR_MAX, TAMANHO_VETOR_MIN);
        int tamanhoVetorDois = verificarTamanho("Insira o tamanho do Segundo vetor: ", TAMANHO_VETOR_MAX, TAMANHO_VETOR_MIN);

        int[] vetorUm = criarVetor(tamanhoVetorUm);
        int[] vetorDois = criarVetor(tamanhoVetorDois);

        povoar(vetorUm, BASE_VETOR_UM);
        povoar(vetorDois, BASE_VETOR_DOIS);

        int tamanhoNovoVetor = tamanhoVetorUm + tamanhoVetorDois;
        int[] novoVetor = criarVetor(tamanhoNovoVetor);

        intercalar(vetorUm, vetorDois, novoVetor);
        System.out.println(Arrays.toString(novoVetor));
    }

    //Intercalar vetores
    private static void intercalar(int[] vetorUm, int[] vetorDois, int[] novoVetor) {
        int i = 0, j = 0, k = 0;

        while (i < vetorUm.length && i < vetorDois.length) {
            novoVetor[k++] = vetorUm[i++];
            novoVetor[k++] = vetorDois[j++];
        }

        while (i < vetorUm.length) {
            novoVetor[k++] = vetorUm[i++];
        }

        while (j < vetorDois.length) {
            novoVetor[k++] = vetorDois[j++];
        }
    }

    //Povoar vetor
    private static void povoar(int[] vetor, int base){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 1) * base;
        }
    }

    //Cria os vetores
    private static int[] criarVetor(int tamanhoDoVetor) {
        return new int[tamanhoDoVetor];
    }

    //Tamanho e verificação de tamanho do vetor
    private static int verificarTamanho(String mensagem, int max, int min) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensagem);
        int tamanho = sc.nextInt();

        boolean continuar = false;
        while (!continuar) {
            if (tamanho < min || tamanho > max) {
                System.err.println("Tamanho de vetor inválido");
            } else {
                continuar = true;
            }
        }
        sc.close();

        return tamanho;
    }

}