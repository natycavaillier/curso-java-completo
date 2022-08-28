package map.exercicio.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // C:\Users\natal\Documents\candidatos.txt

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        Map<String, Integer> totalVotes = new HashMap<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String ballotBox = bf.readLine();

            while (ballotBox != null) {
                String[] fieldsBallotBox = ballotBox.split(",");
                String name = fieldsBallotBox[0];
                int votes = Integer.parseInt(fieldsBallotBox[1]);

                if (totalVotes.containsKey(name)) {
                    int votesOld = totalVotes.get(name);
                    votes = votesOld + votes;
                }

                totalVotes.put(name, votes);

                ballotBox = bf.readLine();
            }

            for (String name : totalVotes.keySet()) {
                System.out.println(name + ": " + totalVotes.get(name));
            }

        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        sc.close();
    }
}
