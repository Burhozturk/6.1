//Opretter en klasse
public class Main
{
    //En klasse som er nødvendig for at main kan køre
    public static void main(String[] args)
    {
        //En for løkke, som kører antal gange
        for(int i=1;i<=100;i++)
        {
            //En if statement, som har en input
            if(i%10==0)
            {
                //En print funktion, som udskriver med med metode som har en værdi med for løkken
                System.out.println(" "+getPentagonNumber(i));

            }
            //Ellers
            else
            {
                //Printer noget med metoden hvor den udskriver denne flere gange med antal som forløkken kører
                System.out.print(getPentagonNumber(i) + " ");
            }
        }

    }
    //En int metode med en input
    public static int getPentagonNumber(int n)
    {
        //Returner en matematisk funktion
        return n*(3*n-1)/2;
    }
}
