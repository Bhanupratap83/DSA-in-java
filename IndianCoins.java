import java.util.*;

// indian currency is a canonical form of currency...
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

    // isko int bhi likh skte the bs fir reverse loop chalana pdta 

    Arrays.sort(coins, Comparator.reverseOrder());

    int countOfCoins = 0;
    int amount = 510;
    ArrayList<Integer> list = new ArrayList<>();

    for(int i=0; i<coins.length; i++){
        if(coins[i] <= amount){
            while(coins[i] <= amount){
                countOfCoins++;
                list.add(coins[i]);
                amount -= coins[i];
            }
        }
    }

    System.out.println("total minimum coins used : "+ countOfCoins);

    for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();
    }
}
