package com.csc205.projects.project7;
/**
 * @author Jeffrey Ciferno
 * Date: 4/18/18
 * 
 * 
 * <pre>
 * Output:
First 10 of Array...
1: 594496
2: 913924
3: 933635
4: 648228
5: 309279
6: 367566
7: 237407
8: 475200
9: 575780
10: 748849

Part A...

First 10 of Array...
1: 998118
2: 997259
3: 994405
4: 994075
5: 993801
6: 993560
7: 992272
8: 990492
9: 989537
10: 988949

Part B...

First 10 of Array...
1: 577
2: 1032
3: 3384
4: 3685
5: 4951
6: 5338
7: 5740
8: 6206
9: 7329
10: 7811

Part C...

First 10 of Array...
1: 577
2: 1032
3: 3384
4: 3685
5: 4951
6: 5338
7: 5740
8: 6206
9: 7329
10: 7811

Part D...

First 10 of Array...
1: 577
2: 1032
3: 3384
4: 3685
5: 4951
6: 5338
7: 5740
8: 6206
9: 7329
10: 7811
 * <pre>
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        final int ARRAY_SIZE = 1000;
        Random generator = new Random();
        Integer[] arr = new Integer[ARRAY_SIZE];

        for (int x = 0; x < ARRAY_SIZE; x++) {
            int value = generator.nextInt(1000000);
            arr[x] = new Integer(value);
        }

        // List first 10 unsorted elements...
        printFirstTenOfArray(arr);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);
        Integer[] copy4 = copyArray(arr);

        // Test 2a
        System.out.println("\nPart A...");
        SortingUtility.selectionSortDescending(copy1);
        printFirstTenOfArray(copy1);

        // Test 2b
        System.out.println("\nPart B...");
        SortingUtility.quickerSort(copy2);
        printFirstTenOfArray(copy2);

        // Test 2c
        System.out.println("\nPart C...");
        SortingUtility.gnomeSort(copy3);
        printFirstTenOfArray(copy3);

        // Test 2d
        System.out.println("\nPart D...");
        SortingUtility.gnomierSort(copy4);
        printFirstTenOfArray(copy4);

    }

    /**
     * Prints the first 10 members of the array.
     * <p>
     * This method works because even if the class type doesn't implement a
     * toString() method (which it should), it at least inherits that method
     * from Object.
     *
     * @param obj
     */
    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {

            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());

                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    /**Copy Array
     * Make a deep copy of the array (values are copied).
     *
     * @param obj
     * @return
     */
    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);

        return copy;
    }

}
