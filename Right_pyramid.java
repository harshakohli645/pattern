public class Right_pyramid {
    public static void main(String[]args)
    {
        int n=5;
        for(int i=1;i<=n*2-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j>=n+1&&i<=n)||(i-j<=n-1&&i>n))
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();             

        }  
    }
    
}
