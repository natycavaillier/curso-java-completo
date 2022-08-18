package tratamentoExcecoes.exercicioFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import tratamentoExcecoes.exercicioFixacao.model.entities.Account;
import tratamentoExcecoes.exercicioFixacao.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data");

            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            double withdraw = sc.nextDouble();

            account.withdraw(withdraw);

            System.out.println(account);

        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }
}
