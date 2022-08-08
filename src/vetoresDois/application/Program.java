package vetoresDois.application;

import java.util.Locale;
import java.util.Scanner;

import produtos.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int length = sc.nextInt();

        Product[] vect = new Product[length];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for(int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;
        System.out.printf("Media do preco = %.2f%n", avg);

        sc.close();
    }
}
