package generics.boundedWildcarts.application;

import java.util.ArrayList;
import java.util.List;

import generics.boundedWildcarts.entities.Circle;
import generics.boundedWildcarts.entities.Rectangle;
import generics.boundedWildcarts.entities.Shape;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(circles));
    }
    
    //Qualquer instancia de subtipos de Shape o método aceitará
    //Não será possível adicionar elementos na lista (list.add(...))
    public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
