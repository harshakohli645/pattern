public class Diamond
{
    public static void main(String[]args)
    {
        int i,j;
        int n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==3||j==3||i+j==n-1||i+j==n+3||i*j==8)
                {
                    
                    System.out.print("*"+"  ");
                    
                }
                else
                    System.out.print("   ");
                
                
            }
            System.out.println();
        }
    }
}
    
