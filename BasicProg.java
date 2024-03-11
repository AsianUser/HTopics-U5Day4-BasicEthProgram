import java.util.*;

public class BasicProg {

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static double findMedian(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Check if the array length is odd or even
        if (n % 2 != 0) {
            // If the length is odd, return the middle element
            return nums[n / 2];
        } else {
            // If the length is even, return the average of the two middle elements
            int mid1 = nums[n / 2 - 1];
            int mid2 = nums[n / 2];
            return (double) (mid1 + mid2) / 2;
        }
    }
}