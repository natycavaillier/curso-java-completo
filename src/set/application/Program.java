package set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        //HashSet é extremamente rapido, mas não mantem a ordem
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Livro");
        hashSet.add("PS5");
        hashSet.add("Violao");

        System.out.println("------ HashSet -----");
        System.out.println(hashSet.contains("Violao"));

        for (String p : hashSet) {
            System.out.println(p);
        }

        //TreeSet é mais lento, mas mantem os dados ordenados com base no compareTo do objeto (no caso da String, ordem alfabetica)
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Notebook");
        treeSet.add("Celular");
        treeSet.add("Teclado");
        treeSet.add("Teclado");

        
        System.out.println("------ TreeSet -----");
        System.out.println(treeSet.contains("Teclado"));

        for (String p : treeSet) {
            System.out.println(p);
        }


        //LinkedHashSet tem velocidade razoavel e matem os elementos na ordem em que foram inseridos
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Notebook");
        linkedHashSet.add("Celular");
        linkedHashSet.add("Teclado");
        linkedHashSet.add("Garrafa");
        linkedHashSet.add("Cubo");

        linkedHashSet.remove("Garrafa");
        linkedHashSet.removeIf(x -> x.charAt(0) == 'N');

        
        System.out.println("------ LinkedHashSet -----");
        System.out.println(linkedHashSet.contains("Teclado"));

        for (String p : linkedHashSet) {
            System.out.println(p);
        }
    }
}
