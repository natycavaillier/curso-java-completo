package arquivos.fileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] { "Bom dia", "Programar eh vida", "Boa noite" };

        String path = "C:\\Users\\natal\\Documents\\out.txt";

        // Instanciando o FileWriter assim: 'new FileWriter(path)', ele cria o arquivo
        // se não existir,
        // ou recria e grava novamente os dados se ele já for existente
        // Instanciando o FileWriter assim: 'new FileWriter(path, true)'
        // ele não recriaria, apenas acrescentaria os dados
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
