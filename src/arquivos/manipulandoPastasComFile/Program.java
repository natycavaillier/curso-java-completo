package arquivos.manipulandoPastasComFile;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de uma pasta: ");
        String strPath = sc.nextLine();

        // File pode ser tanto o caminho de um arquivo quanto o caminho de uma pasta
        File path = new File(strPath);

        // Listar somente quem for diretorio (pasta)
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        //Cria uma subpasta chamada 'subdir'
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + success);

        sc.close();
    }
}
