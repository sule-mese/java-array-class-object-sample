package example.arrays.operator;

import java.util.Random;

public class ArrayOperator {

    private int[] array;


    public ArrayOperator() {
        array = null;
    }

    public ArrayOperator(int[] array) {
        this.array = array;
    }

    public void createArray(int size) {

        array = new int[size];
    }

    public void fillWithRandomNumbers() {

        Random r = new Random();
        for(int i = 0; i < array.length; i++) {

            int randomNumber = (int) (r.nextDouble() * 100);
            array[i] = randomNumber;
        }
    }

    public int sum() {

        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

    public double average() {

        int total = this.sum();
        int size = this.getSize();
        return (total * 1.0) / size;
    }

    public int getSize() {

        return this.array.length;
    }

    public int findMinValue() {

        if(array == null || array.length == 0) {
            return 0;
        }

        int minValue = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public int findMaxValue() {

        if(array == null || array.length == 0) {
            return 0;
        }

        int maxValue = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public void printArray() {

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
