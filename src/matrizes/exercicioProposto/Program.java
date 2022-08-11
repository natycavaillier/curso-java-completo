package matrizes.exercicioProposto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Fazer um programa para ler dois números inteiros M e N, e depois ler
        // uma matriz de M linhas por N colunas contendo números inteiros,
        // podendo haver repetições. Em seguida, ler um número inteiro X que
        // pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        // esquerda, acima, à direita e abaixo de X, quando houver, conforme
        // exemplo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int m = sc.nextInt();
        System.out.print("\nDigite a quantidade de colunas: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("\nDigite os valores da sua matriz:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nDigite um valor pertecente a matriz, para buscar os valores ao seu redor: ");
        int value = sc.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == value){
                    System.out.println("Position " + i + ", " + j + ": ");
                    if(j != 0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Top: " + mat[i - 1][j]);
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if(i < mat.length - 1){
                        System.out.println("Bottom: " + mat[i + 1][j]);
                    }
                    
                }
            }
        }

        sc.close();
    }
}
