package set.aula.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramDois {
    public static void main(String[] args) {
        
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));


        //União
        //Une os dados dos dois conjuntos
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("----- addAll -----");
        System.out.println(c);

        //Interseção
        //Somente os elementos que são comuns aos dois conjuntos
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("----- retainAll -----");
        System.out.println(d);

        //Diferença
        //Remove todos que estão no conjunto passado no parametro
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("----- removeAll -----");
        System.out.println(e);
    }
}
