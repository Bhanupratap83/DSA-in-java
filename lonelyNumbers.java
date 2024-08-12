import java.util.*;

public class lonelyNumbers
{
    public static ArrayList<Integer> LonelyNumbers(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            boolean isLonely = true;
            
            if(i != n-1){
                if(nums[i] == nums[i+1] || nums[i+1] == nums[i]+1){
                    isLonely = false;
                }
            }
            if(i != 0){
                if(nums[i] == nums[i-1] || nums[i-1]+1 == nums[i]){
                    isLonely = false;
                }
            }
            if(isLonely) {
                list.add(nums[i]);
            }
            
        }
        return list;
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int nums[] = {10,6,5,8};
        System.out.print(LonelyNumbers(nums));
	}
}
