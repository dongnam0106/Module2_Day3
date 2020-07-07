package DeleteElement;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Elements in array: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
        }

        System.out.println("Delete element: ");
        int index_del = scanner.nextInt();

        int c;
        for (c = i = 0; i < array.length; i++){
            if (array[i] != index_del){
                array[c] = array[i];
                c++;
            }
        }

        size = c;

        System.out.println("Array after deleting the element " + index_del + " là: ");
            for (i = 0; i < size; i++){
                System.out.println(array[i] + "\t");
            }
    }
}
