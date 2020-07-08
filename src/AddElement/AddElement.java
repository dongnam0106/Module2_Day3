package AddElement;

import java.util.Scanner;

public class AddElement {
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

            System.out.println("Add element: ");
            int element_add = scanner.nextInt();
            System.out.println("Index: ");
            int index_add = scanner.nextInt();

            int[] newArray;
            newArray = new int[size+1];
            for (i = 0; i < index_add; i++){
                newArray[i] = array[i];
            }
            newArray[index_add] = element_add;
            for (int j = index_add+1; j < size+1; j++){
                newArray[j] = array[j-1];
            }

            System.out.println("Array after deleting the element " + "" + " là: ");
            for (int j = 0; j < size+1; j++){
                System.out.println(newArray[j] + "\t");
            }
        }
    }
