package progFuncionalAndLambda.stream.exercicioDois.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import progFuncionalAndLambda.stream.exercicioDois.entities.Employee;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa para ler os dados (nome, email e salário)
        // de funcionários a partir de um arquivo em formato .txt.
        // Em seguida mostrar, em ordem alfabética, o email dos
        // funcionários cujo salário seja superior a um dado valor
        // fornecido pelo usuário.
        // Mostrar também a soma dos salários dos funcionários cujo
        // nome começa com a letra 'M'.

        // C:\Users\natal\Documents\exercicioStream.txt

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employee> employees = new ArrayList<>();

            String employeeInformation = br.readLine();

            while (employeeInformation != null) {
                String[] employeeSplitted = employeeInformation.split(",");
                String name = employeeSplitted[0];
                String email = employeeSplitted[1];
                double salary = Double.parseDouble(employeeSplitted[2]);

                employees.add(new Employee(name, email, salary));

                employeeInformation = br.readLine();
            }

            System.out.print("Digite o salario: ");
            double inputSalary = sc.nextDouble();

            List<String> emails = employees.stream()
                    .filter(employee -> employee.getSalary() > inputSalary)
                    .map(employee -> employee.getEmail())
                    .sorted((email1, email2) -> email1.toUpperCase().compareTo(email2.toUpperCase()))
                    .collect(Collectors.toList());

            System.out.printf("Email dos empregados que o salario eh maior que %.2f:\n", inputSalary);
            for (String email : emails) {
                System.out.println("- " + email);
            }

            System.out.print("Digite a letra inicial dos empregados que deseja visualizar a soma dos salarios: ");
            char firstLetter = sc.next().toUpperCase().charAt(0);

            double sum = employees.stream()
                    .filter(employee -> employee.getName().charAt(0) == firstLetter)
                    .map(employee -> employee.getSalary())
                    .reduce(0.0, (x1, x2) -> x1 + x2);

            System.out.printf("Soma dos salarios dos empregados cujo nome inicia com 'M': %.2f", sum);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
