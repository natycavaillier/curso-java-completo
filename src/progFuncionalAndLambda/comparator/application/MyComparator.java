package progFuncionalAndLambda.comparator.application;

import java.util.Comparator;

import progFuncionalAndLambda.comparator.entities.Product;

//Interface Funcional:
//Interface que possui um único método abstrato
//Suas implementações serão tratadas como expressões lambda (Opção 1 da classe Program)
public class MyComparator implements Comparator<Product>{

    //Assim como o Comparable
    //retorna um inteiro que vai ser positivo, caso o primeiro seja maior que o segundo
    //0 se forem iguais
    //negativo se o primeiro for menor que o segundo
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
    
}
