// Anay Goyal

public class StringMethods
{
	public String str = new String("Hello World");
	public static void main(String[] args)
	{
		StringMethods SM = new StringMethods();
		//System.out.println("\n\n\n" + SM.charAt(4) +"\n\n\n");
		System.out.print("\n\n\n");
		SM.lastIndexOf('W');
		System.out.print("\n\n\n");
	}
	
	public void lastIndexOf(char a)
	{
		boolean found = false;
		int length = str.length();
		do
		{
			if(str.charAt(length-1) == a)
			{
				found = true;
				System.out.println(length-1);
			}
			else
			{
				length--;
			}
			
			
		}
		while(found == false);
	}
	public String charAt(int x)
	{
		return (str.substring(x,x+1));
	}		
}	
