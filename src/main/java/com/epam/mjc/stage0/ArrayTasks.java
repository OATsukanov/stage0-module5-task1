package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        String[] seasons = {"winter", "spring", "summer", "autumn"};

        return seasons;

    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {

        int[] numbers = new int[length];

        for(int i = 1; i <= numbers.length; i++) {

            numbers[i-1] = i;
        }

        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */

    public int totalSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {

        int searchingNumberIndex = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == number) {

                searchingNumberIndex = i;
                break;
            }
        }

        return searchingNumberIndex;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {

        String[] reversedArr;
        reversedArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            reversedArr[(reversedArr.length - 1) - i] = arr[i];
        }

        return reversedArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int positiveNumbersCount = 0;
        for(int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) positiveNumbersCount++;
        }

        int[] positiveNumbers;
        positiveNumbers = new int[positiveNumbersCount];

        int f = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                positiveNumbers[f] = arr[i];
                f++;
            }
        }


        return positiveNumbers;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

            for (int i = 0; i < arr.length; i++) {

                for (int f = 0; f < arr.length - 1; f++) {

                    if (arr[f].length > arr[f + 1].length) {
                        int[] tmp = arr[f + 1];
                        arr[f + 1] = arr[f];
                        arr[f] = tmp;
                    }
                }
            }

            for (int[] subArray : arr) {

                for (int i = 0; i < subArray.length; i++) {

                    for (int f = 0; f < (subArray.length - 1); f++) {

                        if (subArray[f] > subArray[f + 1]) {
                            int tmp = subArray[f + 1];
                            subArray[f + 1] = subArray[f];
                            subArray[f] = tmp;
                        }
                    }
                }
            }

        return arr;
    }
}
