package set.exercicioUm.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set.exercicioUm.entities.LogEntry;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // C:\Users\natal\Documents\exercicioUmSet.txt
        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ");

                String username = fields[0];
                LocalDateTime moment = LocalDateTime.ofInstant(Instant.parse(fields[1]), ZoneId.of("America/Sao_Paulo"));

                //Set nao permite repetições, então quando for tentar adicionar
                //nomes iguais, não vai conseguir
                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }

            System.out.println("Total de usuarios: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
