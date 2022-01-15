package exercise02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver, conforme
 * exemplo.
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a Quantidade de Linhas: ");
        int rows = sc.nextInt();
        System.out.print("Digite a Quantidade de Colunas: ");
        int columns = sc.nextInt();

        int[][] mat = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite um número da matriz");
        int number = sc.nextInt();


        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (number == mat[i][j]){
                    System.out.println("POSITION " + i + "x" + j);
                    if (j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
