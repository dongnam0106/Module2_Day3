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
            for (i = array.length; i > 0; i--){
                newArray[i] = array[i];
                if (i == index_add){
                    newArray[i] = element_add;
                    break;
                }
            }

            size = i;

            System.out.println("Array after deleting the element " + "" + " là: ");
            for (i = 0; i < size; i++){
                System.out.println(newArray[i] + "\t");
            }
        }
    }
