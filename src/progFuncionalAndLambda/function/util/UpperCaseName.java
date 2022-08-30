package progFuncionalAndLambda.function.util;

import java.util.function.Function;

import progFuncionalAndLambda.function.entities.Product;

//Function tem o tipo de entrada e o tipo de saida
public class UpperCaseName implements Function<Product, String>{

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
    
}
