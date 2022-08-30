package progFuncionalAndLambda.progFuncional.application;

import java.util.ArrayList;
import java.util.List;

import progFuncionalAndLambda.progFuncional.entities.Product;


public class Program {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//Função como objeto de primeira classe,
		//sendo passado como parâmetro de um método (pode também ser retornado por uma função)
		list.sort(Program::compareProducts);

		list.forEach(System.out::println);
	}

}
