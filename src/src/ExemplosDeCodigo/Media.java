// https://judge.beecrowd.com/pt/problems/view/1006

package ExemplosDeCodigo;
import java.io.IOException;
import java.util.Scanner;

public class Media {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double a, b, c, media;
        int[] peso = {2, 3, 5};
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        media = ((peso[0] * a) + (peso[1] * b) + (peso[2] * c)) / 10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
