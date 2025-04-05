import java.util.*;

public class UnionAndIntersectionOfTwoArrays{
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();
    
        //union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);   
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("union: "+set.size());
    
        //intersection
        set.clear(); // same set khaali kra diya reuse krne e liye
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int cnt=0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                cnt++;
                set.remove(arr2[i]);
            }
        }

        System.out.println("Intersection: "+cnt);
    }
}