package progFuncionalAndLambda.stream.exercicio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import progFuncionalAndLambda.stream.exercicio.entities.Product;

public class Program {
    public static void main(String[] args) {

        // C:\Users\natal\Documents\exercicioStream.txt
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String productInformation = br.readLine();

            while (productInformation != null) {
                String[] productSplitted = productInformation.split(",");
                String name = productSplitted[0];
                double price = Double.parseDouble(productSplitted[1]);

                list.add(new Product(name, price));

                productInformation = br.readLine();
            }

            double average = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x, y) -> x + y) / list.size();

            System.out.println("Preco medio: " + String.format("%.2f", average));

            Comparator<String> comp = (s1, s2) -> (s1.toUpperCase().compareTo(s2.toUpperCase()));

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < average)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
