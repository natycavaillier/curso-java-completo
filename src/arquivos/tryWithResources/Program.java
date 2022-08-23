package arquivos.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        // Não é necessário fazer o fechamento manual usando o try-with-resources

        String path = "C:\\Users\\natal\\Documents\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê uma linha e se o arquivo estiver no final, o arquivo retornará nulo
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
