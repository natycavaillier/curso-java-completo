package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int length = sc.nextInt();
        double[] vect = new double[length];

        for(int i = 0; i < length; i++){
            System.out.println("Digite o " + (i + 1) + "o item do vetor: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < length; i++){
            sum += vect[i];
        }

        double avg = sum / length;

        System.out.printf("Average: %.2f%n", avg);


        sc.close();
    }
}
