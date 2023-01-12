import java.util.ArrayList;

public class kth_prime {
    static int n =86028121;
    static boolean sieve[] = new boolean[n+1];
    static ArrayList<Integer> ds=new ArrayList<>();
    static void kth() {
        for (int i = 2; i <= n; i++) {
            sieve[i] = true;
        }
        for (int i = 2;i*i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }

        }
 

        for (int i = 2;i<=n ; i++) {
            if (sieve[i] ) {
                ds.add(i);
            }

        }

    }

    public static void main(String[] args) {
     kth();
        System.out.println(ds.get(4));
    }
}
