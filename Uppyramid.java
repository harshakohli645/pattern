public class Uppyramid {
    public static void main(String[]args)
    {
        int i,j;
        int n=3;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n*2-1;j++)
            {
                if(j+i>=n+1&&j<=n ||j-i<=n-1&&j>n)
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
