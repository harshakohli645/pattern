public class Butterfly {
    public static void main(String[]args)
    {
        int i,j;
        int n=6;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==3||i==4||i==j||i+j==n+1||j==1||j==n)
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
