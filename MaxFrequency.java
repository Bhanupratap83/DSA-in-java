import java.util.ArrayList;
import java.util.Arrays;

public class MaxFrequency {
    public static int mostFrequent(ArrayList<Integer> nums, int key){
        int count[] = new int[1001];

        // building the counting array
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i) == key){
                count[nums.get(i+1)]++;
            }
        }

        // finding the index with the greatest entry
        int maxValue = 0;
        int target = 0;
        for(int i=0; i<count.length; i++){
            if(count[i] > maxValue){
                target = i;
                maxValue = count[i];
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 1, 2, 1, 2, 3));
        int key = 2;
        System.out.print(mostFrequent(nums,key));
    }
}
