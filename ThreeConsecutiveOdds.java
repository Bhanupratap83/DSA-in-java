public class ThreeConsecutiveOdds{
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 !=0){
                odd++;
                if(odd >= 3) return true;
            } else odd = 0;
        }
        return false;
    }
}