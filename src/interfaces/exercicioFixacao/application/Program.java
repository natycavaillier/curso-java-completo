package interfaces.exercicioFixacao.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.exercicioFixacao.entities.Contract;
import interfaces.exercicioFixacao.entities.Installment;
import interfaces.exercicioFixacao.services.ContractService;
import interfaces.exercicioFixacao.services.OnlinePaymentService;
import interfaces.exercicioFixacao.services.PaypalService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato: ");

        System.out.print("Numero: ");
        Integer number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dateFormatter);

        System.out.print("Valor total do contrato: ");
        Double totalValue = sc.nextDouble();

        System.out.print("Quantidade de parcelas: ");
        Integer installments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);

        System.out.println("\n----------Parcelas----------");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
