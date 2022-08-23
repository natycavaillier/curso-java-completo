package arquivos.exercicioProposto.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import arquivos.exercicioProposto.entities.Product;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa para ler o caminho de um arquivo .txt
        // contendo os dados de itens vendidos. Cada item possui um
        // nome, preço unitário e quantidade, separados por vírgula. Você
        // deve gerar um novo arquivo chamado "summary.txt", localizado
        // em uma subpasta chamada "out" a partir da pasta original do
        // arquivo de origem, contendo apenas o nome e o valor total para
        // aquele item (preço unitário multiplicado pela quantidade),
        // conforme exemplo.

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        // C:\\Users\\natal\\Documents\\original.txt
        System.out.println("Digite o caminho de um arquivo: ");
        String sourcePath = sc.nextLine();

        File sourceFile = new File(sourcePath);

        String sourceDirectory = sourceFile.getParent();
        boolean success = new File(sourceDirectory, "\\out").mkdir();

        String summaryPath = sourceDirectory + "\\out\\summary.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {

            String sourceItem = br.readLine();

            while (sourceItem != null) {
                String[] productSplitted = sourceItem.split(",");

                String name = productSplitted[0];
                double price = Double.parseDouble(productSplitted[1]);
                int quantity = Integer.parseInt(productSplitted[2]);

                products.add(new Product(name, price, quantity));

                sourceItem = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryPath))) {

                for(Product product : products){
                    bw.write(product.getName() + ",R$" + String.format("%.2f", product.totalPrice()));
                    bw.newLine();
                }

                System.out.println("SUMMARY CRIADO COM SUCESSO");

            } catch (IOException e) {
                System.out.println("Error writing: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }

    }
}
