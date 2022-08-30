package progFuncionalAndLambda.comparator.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import progFuncionalAndLambda.comparator.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// Comparator é uma interface funcional (tem apenas um método abstrato)

		// Opção 1
		// list.sort(new MyComparator());

		// Opção 2
		// Comparator<Product> comp = new Comparator<Product>() {
		// 	@Override
		// 	public int compare(Product p1, Product p2) {
		// 		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// 	}
		// };
		// list.sort(comp);

		// Opção 3
		// Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		// list.sort(comp);

		// Opção 4
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
