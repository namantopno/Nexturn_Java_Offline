import java.lang.reflect.Array;
import java.util.Arrays;

public class UsingArray {
    public static void main(String[] args) {
        int[] num = {9, 2, 7, 4, 5};
        int s = num.length;
        for (int i = s-1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        for(int l:num){
            System.out.println(num[l]);
        }

//        1.    length – A property (not a method) that returns the size of the array.
//        2.	Arrays.toString(array) – Converts an array into a string representation.
        String s2 = Arrays.toString(num);
        System.out.println(s2);
//        3.	Arrays.sort(array) – Sorts an array in ascending order.
        Arrays.sort(num);
        for(int l:num){
            System.out.println(num[l]);
        }

//        4.	Arrays.fill(array, value) – Fills an array with a specific value.
        Arrays.fill(num, 12);
        for(int l:num){
            System.out.println(num[l]);
        }
//        5.	Arrays.copyOf(array, newLength) – Creates a copy of an array with a specified size.
        int[] num2 = Arrays.copyOf(num,3);
        for(int l:num2){
            System.out.println(num2[l]);
        }
//        6.	Arrays.copyOfRange(array, from, to) – Copies a specific range from an array.
        int[] num3 = Arrays.copyOf(num,3);
        for(int l:num){
            System.out.println(num[l]);
        }
//        7.	Arrays.equals(array1, array2) – Checks if two arrays are equal.
        if(Arrays.equals(num,num2)){
            System.out.println("array are equal");
        }
        else{
            System.out.println("not equal");
        }
//        8.	Arrays.binarySearch(array, value) – Searches for a value in a sorted array and returns its index.
        int ser = Arrays.binarySearch(num,2);
        System.out.println(ser);


//        9.	Arrays.deepToString(array) – Converts multi-dimensional arrays into a string.
//        10.	Arrays.asList(array) – Converts an array into a List (only for non-primitive types).
    }
}
