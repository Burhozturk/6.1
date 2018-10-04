public class Main
{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            if(i%10==0)
            {
                System.out.println(" "+getPentagonNumber(i));

            }
            else
            {
                System.out.print(getPentagonNumber(i) + " ");
            }
        }

    }
    public static int getPentagonNumber(int n)
    {
        return n*(3*n-1)/2;
    }
}
