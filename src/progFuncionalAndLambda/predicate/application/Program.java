package progFuncionalAndLambda.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import progFuncionalAndLambda.predicate.entities.Product;
import progFuncionalAndLambda.predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Opção 1
		// list.removeIf(new ProductPredicate());

		// Opção 2 (método da classe Product, estático)
		// Coloca a classe que o método está, '::' e o nome do método
		// list.removeIf(Product::staticProductPredicate);

		// Opção 3 (método da classe Product, não estático)
		// list.removeIf(Product::nonStaticProductPredicate);

		// Opção 4 (Expressão lambda declarada)
		// Predicate<Product> pred = p -> p.getPrice() >= 100;
		// list.removeIf(pred);

		// Opção 5 (Expressão lambda inline)
		list.removeIf(p -> p.getPrice() >= 100);

		for (Product p : list) {
			System.out.println(p);
		}

	}
}
