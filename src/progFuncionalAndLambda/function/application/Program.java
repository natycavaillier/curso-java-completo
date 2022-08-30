package progFuncionalAndLambda.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import progFuncionalAndLambda.function.entities.Product;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Função map (função que aplica uma função a cada elemento de uma stream
        // gerando uma nova stream com os elementos transformados)
        // Converter:
        // - List para stream: .stream()
        // - Stream para List: .collect(Collectors.toList())

        // Opção 1 (implementação da interface)
        // List<String> names = list.stream().map(new
        // UpperCaseName()).collect(Collectors.toList());

        // Opção 2 (reference method com método estático)
        // List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // Opção 3 (reference method com método não estático)
        // List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        // Opção 4 (expressão lambda declarada)
        // Function<Product, String> func = p -> p.getName().toUpperCase();
        // List<String> names = list.stream().map(func).collect(Collectors.toList());

        // Opção 5 (expressão lambda inline)
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
