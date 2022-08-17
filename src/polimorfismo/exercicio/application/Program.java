package polimorfismo.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.exercicio.entities.Company;
import polimorfismo.exercicio.entities.Individual;
import polimorfismo.exercicio.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantityTaxPayers = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for(int i = 0; i < quantityTaxPayers; i++){
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c): ");
            char typeTaxPayer = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();


            if(typeTaxPayer == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
            
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0;

        for(TaxPayer taxPayer : taxPayers){
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $" + String.format("%.2f", taxPayer.tax()));
        }

        System.out.println("TOTAL TAXES: $" + totalTaxes);


        sc.close();
        
    }
}
