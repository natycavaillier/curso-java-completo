package listas.teoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");

        System.out.println("Tamanho da lista: " + list.size());

        for(String nome : list){
            System.out.println(nome);
        }

        System.out.println("---------------------");

        // list.remove("Ana");
        // list.remove(1);

        list.removeIf(nome -> nome.charAt(0) == 'M');

        System.out.println("Lista apos remover nomes que começam com a letra 'M':");
        for(String nome : list){
            System.out.println(nome);
        }

        
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("---------------------");

        List<String> result = list.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("Filtro de nomes que começam com a letra 'A':");
        for(String nome : result){
            System.out.println(nome);
        }

        System.out.println("---------------------");
        
        String name = list.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Encontrar primeiro elemento que comece com a letra 'A':");
        System.out.println(name);
    }
}
