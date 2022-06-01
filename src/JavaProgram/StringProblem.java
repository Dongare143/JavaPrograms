package JavaProgram;

public class StringProblem 
{
	public static void main(String[] args) 
	{
		String s = "Pandurang";
		int len = s.length();
		String rev = "";
		 
		for(int i=len-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		
		//using StringBuffer
	    StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());
	}
	
	
	

}
