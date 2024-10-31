public class MinimumSizeSubarraySum{
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int ansLen = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            while(sum >= target){
                ansLen = Math.min(ansLen, i-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(ansLen == Integer.MAX_VALUE) return 0;
        else return ansLen;
    }
}