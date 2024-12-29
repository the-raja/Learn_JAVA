package H_Sorting;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // https://leetcode.com/problems/missing-number/
    // Amazon Question
    static class MissingNumber {

        public static void main(String[] args) {
            int[] arr = {4, 0, 2, 1};
            System.out.println(missingNumber(arr));
        }

        public static int missingNumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if (arr[i] < arr.length && arr[i] != arr[correct]) {
                    swap(arr, i , correct);
                } else {
                    i++;
                }
            }

            // search for first missing number
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index) {
                    return index;
                }
            }

            // case 2
            return arr.length;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
}
