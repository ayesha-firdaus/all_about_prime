import java.util.Arrays;
import java.util.Scanner;
//o(n log(log n))
public class seive_of_Eratosthenes {
   static int n=1000000;
   static boolean sieve[]=new boolean[1000001];
 static   void setSieve()
    {
        for(int i=2;i<=n;i++)
        {
            sieve[i]=true;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(sieve[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                   sieve[j]=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        setSieve();

        if(sieve[n])
        {
            System.out.println("Prime number");
        }
        else{
            System.out.println("not a prime number");
        }
    }
}
