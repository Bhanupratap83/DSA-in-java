
import java.util.ArrayList;

public class BeautifulArrayList {
    public static void main(String args[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = 4;
        int remaining = n-1;
        ans.add(1);

        for(int i=1; i<remaining; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int element : ans){
                if(element*2 <= n){
                    temp.add(2*element);
                }
            }
            for(int element : ans){
                if(element*2-1 <= n){
                    temp.add(2*element-1);
                }
            }
            ans = temp;

        }
        System.out.println(ans);
    }
}
