package progFuncionalAndLambda.stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        // Sequência de elementos advinda de uma fonte de dados (array, função de
        // iteração, recurso de I/O)
        // que oferece suporte a 'operações agredadas'

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        //Converte a stream para um array
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Natalia", "Gabriela", "Fernanda");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

    }
}
