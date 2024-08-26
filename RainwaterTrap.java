import java.util.*;

public class RainwaterTrap {
    public static int trap(int height[]){
        Stack<Integer> s = new Stack<>();
        int ans = 0;

        for(int i=0; i<height.length; i++){
            while(!s.isEmpty() && height[s.peek()] < height[i]){
                int n = s.pop();
                if(s.isEmpty()){
                    break;
                }
                int l = s.peek();
                int h = Math.min(height[i], height[l]) - height[n];

                int w = i-l-1;
                ans = ans + h*w;
            }
            s.push(i);
        }
        return ans;
    }
}
