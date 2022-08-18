package tratamentoExcecoes.excecoesPersonalizadas.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import tratamentoExcecoes.excecoesPersonalizadas.model.entities.Reservation;
import tratamentoExcecoes.excecoesPersonalizadas.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(sc.next(), formatter);

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(sc.next(), formatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(sc.next(), formatter);

            reservation.updateDates(checkIn, checkOut);

            System.out.println("Reservation: " + reservation);

        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }catch(RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
