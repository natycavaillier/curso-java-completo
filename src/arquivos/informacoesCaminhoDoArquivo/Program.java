package arquivos.informacoesCaminhoDoArquivo;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Usar C:\Users\natal\Documents\in.txt
        System.out.println("Digite o caminho de um arquivo: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //Só o nome do arquivo
        System.out.println("getName: " + path.getName());

        //Só o caminho sem o arquivo
        System.out.println("getParent: " + path.getParent());

        //O caminho completo
        System.out.println("getPath: " + path.getPath());

    }
}
