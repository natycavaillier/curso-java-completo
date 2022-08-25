package interfaces.defaultMethods.application;

import java.util.Locale;
import java.util.Scanner;

import interfaces.defaultMethods.services.BrazilInterestService;
import interfaces.defaultMethods.services.InterestService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestService interestService = new BrazilInterestService(1.0);
        double payment = interestService.payment(amount, months);

        System.out.println("Pagamento apos " + months + " meses:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
