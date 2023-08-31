
// 1. create an array of 5 floats and calculate their sum................

import java.util.Scanner;

public class PracticeSet_6 {
/*    public static void main(String[] args) {
        float []array = new float [5];
        float sum = 0;
        for (int i=0;i<5;i++) {
            System.out.println("Enter your number:");
            Scanner s = new Scanner(System.in);
            float num = s.nextFloat();
            sum = sum + num;
        }
        System.out.println("Sum of given array is:");
        System.out.println(sum);
    }

 */

// 2. write a program to find out whether a given integer is present in array or not................
/*
    public static void main(String[] args) {
        int[] array = {40, 45, 56, 55, 85, 95, 75, 25, 10, 28, 76, 70, 80, 90, 20, 35, 42, 58, 30, 35, 15, 10};
        System.out.println("Enter your number:");
        Scanner s = new Scanner(System.in);
        boolean isinarray = false;
        int num = s.nextInt();
        for (int element : array) {
            if (num == element) {
                isinarray = true;
                break;
            }
        }
        if (isinarray) {
            System.out.println("Your number is present in this array!!");
        } else {
            System.out.println("Your number is not present in this array!!");
        }
    }

 */

// 3. calculate the average marks from an array containing marks of all students in physics using for loop...
/*    public static void main(String[] args) {
        float []marks={45.5f,86,84,78.5f,55,75,89,92,80,86,86.5f,82.5f,92.5f};
        float average;
        float sum=0;
        for (float element:marks) {
            sum = sum + element;
        }
        System.out.println("Average of marks is : "+sum/ marks.length);
}
 */

// 4. create a java program to add two matrices of size 2x3........................
/*
    public static void main(String[] args) {
    int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
    int[][] matrix2 = {{6, 5, 4}, {3, 2, 1}};
    int[][] result = new int[2][3];

    // Adding the matrices
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }

    // Printing the result
    for (int[] row : result) {
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

 */

 // 5. write a program to reverse an array..................................

    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,100};
        for (int i=0;i<= array.length;i++){
            System.out.println(i);
        }

    }
}
