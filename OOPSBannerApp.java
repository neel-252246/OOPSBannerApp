public class OOPSBannerApp 
{
    public static void main(String[] args) 
	{
        String[] lines= {String.join(" ", "  ***  " , "  ***** " , "  ***** " , "  ***** "),
		String.join(" ", " *   * " , "  *   * " , "  *   * " , "  *     "),
		String.join(" ", " *   * " , "  ***** " , "  ***** " , "  ***** "),
		String.join(" ", " *   * " , "  *     " , "  *     " , "      * "),
		String.join(" ", "  ***  " , "  *     " , "  *     " , "  ***** ")};
		for (String print : lines)
		{
			System.out.println(print);
		}
    }
}