package progFuncionalAndLambda.consumer.util;

import java.util.function.Consumer;

import progFuncionalAndLambda.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

}
