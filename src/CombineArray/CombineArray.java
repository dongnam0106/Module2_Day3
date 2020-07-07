package CombineArray;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        int size1 = 5;
        int size2 = 3;
        int size3 = size1 + size2;
        int[] array1, array2, array3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input array1:");
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
            sc.nextLine();
            i++;
        }

        System.out.println("Elements in array: ");
        for (int j = 0; j < array1.length; j++){
            System.out.println(array1[j] + "\t");
        }

        i=0;
        System.out.println("Input array2: ");
        array2 = new int[size2];
        while (i < array2.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
            i++;
        }

        System.out.println("Elements in array: ");
        for (int j = 0; j < array2.length; j++){
            System.out.println(array2[j] + "\t");
        }

        int z=0;
        array3 = new int[size3];
        while ( z < array1.length){
            array3[z]= array1[z];
            z++;
        }
//            for (int j = i; j < i; j++){
//                array3[size3-i-1]= array2[j];
//            }

        System.out.println("Elements in array: ");
        for (int j = 0; j < array1.length; j++){
            System.out.println(array3[j] + "\t");
        }
    }
}
