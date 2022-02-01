public class FindMean {

    public static double findMean(double[] nums) {
        double mean = findSum(nums) / nums.length;
        return mean;
    }

    public static double findSum(double[] nums) {
        double sum = 0.0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        return 0.0;
    }
    
}