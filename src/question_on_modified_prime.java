import java.util.Scanner;


public class question_on_modified_prime {
    static void factor(int n)
    {
        int first=0,second=0,flag=0;
        for(int i=2;i*i<=n;i++) {
            if (n % i == 0) {
                if (first == 0) {
                    first = i;
                    n /= i;
                } else {
                    second = i;
                    n = n / i;
                    if (first < second && second < n) {
                        flag = 1;
                        break;
                    }
                }
            }
        }
            if(flag==1)
            {
                System.out.println("YES");
                System.out.println(first+" "+second+" "+n);

            }
            else {
                System.out.println("NO");
            }

    }

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
          int n=sc.nextInt();
          factor(n);
      }

    }

}
