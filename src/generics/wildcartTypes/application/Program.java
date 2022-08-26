package generics.wildcartTypes.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Não permite:
        // List<Object> myObjs = new ArrayList<Object>();
        // List<Integer> myNumbers = new ArrayList<Integer>();
        // myObjs = myNumbers;

        // Tipo curinga:
        // Supertipo de qualquer tipo de lista é List<?>
        // List<?> myObjs = new ArrayList<Object>();
        // List<Integer> myNumbers = new ArrayList<Integer>();
        // myObjs = myNumbers;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);
    }

    public static void printList(List<?> list) {
        //Não tem como fazer add na lista porque ela nao sabe
        //qual o tipo específico da lista quando ela for instanciada
        // list.add(3);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
