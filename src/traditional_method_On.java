public class traditional_method_On {
//    o(n)
   static boolean prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(prime(54));
    }
}
