public class LongestSubarrayWithMaximumBitwiseAND {

        public static int longestSubarray(int[] nums) {
            int maxNum = 0;
            int maxEle = nums[0];  
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > maxEle) {
                    maxEle = nums[i]; 
                }
            }
            maxNum=Math.max(maxNum,maxEle);
    
            int maxLen = 0;
            int currentLen = 0;
            for(int i=0;i<nums.length; i++){
                if(nums[i] == maxNum){
                    currentLen++;
                    maxLen=Math.max(maxLen,currentLen);
                }else{
                    currentLen=0;
                }
            }
            return maxLen;
        }

        public static void main(String args[]){
            int nums[] = {1, 2, 3, 3, 2, 2};
            System.out.println(longestSubarray(nums));
        }
}
