package matrizes.exercicioResolvido;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++){
            //A linha 1 contem 3 itens no array, que sao as colunas
            for(int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for(int i = 0; i < mat.length; i++){
            //A diagonal sempre tem linha e coluna com valores iguais
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();


        int count = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);

        sc.close();
    }
}
