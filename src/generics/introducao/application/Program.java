package generics.introducao.application;

import java.util.Scanner;

import generics.introducao.services.PrintService;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Como foi colocado tipo 'T' no PrintService, pode-se colocar qualquer tipo no diamante abaixo
        //Mas aí todas as operações da classe, apenas aceitarão esse mesmo tipo
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
    }
}
