import java.util.*;

public class TwoSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = 0;
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            a.add(i);
            s += i;
        }

        Set<Integer> v1 = new HashSet<>();
        Set<Integer> v2 = new HashSet<>();
        
        if (s % 2 == 0) {
            long midVal = s / 2;
            for (int i = n; i >= 1; i--) {
                if (i <= midVal) {
                    v1.add(i);
                    midVal -= i;
                } else {
                    break;
                }
            }

            if (midVal != 0) {
                v1.add((int)midVal);
            }

            for (int i = 1; i <= n; i++) {
                if (!v1.contains(i)) {
                    v2.add(i);
                }
            }

            System.out.println("YES");
            System.out.println(v1.size());
            for (int num : v1) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println(v2.size());
            for (int num : v2) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}

