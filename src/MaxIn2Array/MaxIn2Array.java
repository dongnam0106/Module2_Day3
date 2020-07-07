package MaxIn2Array;

import java.util.Scanner;

public class MaxIn2Array {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Array input: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.println("Element " + (i+1) + "-" + (j+1));
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Element in array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max in array: " + max);

    }
}
