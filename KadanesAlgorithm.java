
import java.util.*;

public class KadanesAlgorithm {
    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long MaxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + MaxSum);

    }

}
