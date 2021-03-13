package example.arrays;

import example.arrays.operator.ArrayOperator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        String choice = "";

        int[] tmpArray = new int[10];

        ArrayOperator operator = new ArrayOperator(tmpArray);

        while( !"q".equals(choice) ) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Array size: ");
            int size = scanner.nextInt();

            //operator.createArray(size);
            operator.fillWithRandomNumbers();
            operator.printArray();

            System.out.println("Size Val: " + operator.getSize());

            int minValue = operator.findMinValue();
            System.out.println("Min Val: " + minValue);

            int maxValue = operator.findMaxValue();
            System.out.println("Max Val: " + maxValue);

            int total = operator.sum();
            System.out.println("Total Val: " + total);

            double avg = operator.average();
            System.out.println("Average Val: " + avg);

            System.out.println("For exit press 'q' ...");
            choice = scanner.next();
        }
    }
}
