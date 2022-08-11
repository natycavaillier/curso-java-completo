package listas.exercicio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import listas.exercicio.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        Integer quantity = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < quantity; i++){

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();

            while(hasId(employees, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary:");
            Double salary = sc.nextDouble();

            System.out.println("---------------------");

            Employee currentEmployee = new Employee(id, name, salary);

            employees.add(currentEmployee);

        }

        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();

        Employee employeeFound = employees.stream().filter(employee -> employee.getId() == idToIncrease).findFirst().orElse(null);

        if (employeeFound == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employeeFound.increaseSalary(percentage);
		}

        System.out.println();
		System.out.println("List of employees:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
				
		sc.close(); 

    }

    public static boolean hasId(List<Employee> employees, int id) {
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
