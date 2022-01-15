package exercise01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e uma matriz de
 * ordem N contendo números inteiros. Em seguida, mostrar a diagonal
 * principal e a quantidade de valores negativos da matriz.
 */

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas e colunas da Matriz: ");
        int n = sc.nextInt();
        int negativeNumbers = 0;
        List<Integer> mainDiagonal = new ArrayList<>();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0){
                    negativeNumbers++;
                }
                if (i == j){
                    mainDiagonal.add(mat[i][j]);
                }
            }
        }

        System.out.println("\nMain Diagonal: ");
        for (int mainD : mainDiagonal)
            System.out.print(mainD + " ");

        System.out.println("\nNegative Numbers: " + negativeNumbers);

        sc.close();



    }
}
