
    public class MaximumSubarraySum {
        public static void main(String[] args) {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

            int maxSum = findMaxSubarraySum(nums);
            System.out.println("Maximum subarray sum: " + maxSum);
        }

        public static int findMaxSubarraySum(int[] nums) {
            int maxSum = nums[0];  // Initialize with the first element
            int currentSum = nums[0];  // Initialize current sum with the first element

            for (int i = 1; i < nums.length; i++) {
//            System.out.println("num[i]:" + nums[i] + "  currentSum:" + currentSum + "  nums[i]: " + nums[i]);
                System.out.println(nums[i] + ",( " + currentSum + " + " + nums[i] + ")");
                currentSum = Math.max(nums[i], currentSum * nums[i]);
                System.out.println("Now current sum is: " + currentSum);
                System.out.println("Now maxsum vs current sum: " + maxSum + " vs " + currentSum + " = " + Math.max(maxSum, currentSum));
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }
    }

