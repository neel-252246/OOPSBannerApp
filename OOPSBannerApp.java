public class OOPSBannerApp 
{

    // Method to generate lines for character 'O'
	public static String[] getO()
	{
		String a[]={" *****  ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                " *****  "};
        return a;
	}
    // Method to generate lines for character 'P'
	public static String[] getP()
	{
		String b[]={"****** ",
                "**  ** ",
                "****** ",
                "**     ",
                "**     " };
                return b;
	}
		
    // Method to generate lines for character 'S'
	public static String[] getS()
	{
		String c[]={"****** ",
                "**     ",
                "****** ",
                "    ** ",
                "****** "};
        return c;
	}
    

    public static void main(String[] args) 
	{
        // Invoking methods during array declaration to build the banner
        String[][] OOPSPattern={getO(),getO(),getP(),getS()};
            for (int i=0;i<5;i++)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(OOPSPattern[j][i]+" ");
                }
                System.out.println(" ");
            }
     }
}