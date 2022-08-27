package hashCodeAndEquals.application;

import hashCodeAndEquals.entities.Client;

public class Program {
    public static void main(String[] args) {

        // Equals e HashCode sao operacoes da classe Object que
        // comparam se um objeto é igual a outro

        String a = "Naty";
        String b = "Gabi";
        
        // equals é mais lento mas a resposta tem 100% de certeza
        System.out.println("Equals: " + a.equals(b));

        // hashCode é mais rápido, mas a resposta tem 100% de certeza
        System.out.println("hashCode de A: " + a.hashCode());
        System.out.println("hashCode de B: " + b.hashCode());

        Client c1 = new Client("Naty", "nataliacavaillier@gmail.com");
        Client c2 = new Client("Gabi", "gabrielasena@gmail.com");
        System.out.println("Equals c1 e c2: " + c1.equals(c2));
    }
}
