
package Main;


public class DomainTokensCounter {
	public static String str;
	public static String mstr;
public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	PhishTankBlackList.main(args);
	str=PhishTankBlackList.url();
	String mstr=str;
	mstr = mstr.replaceAll("http://www.","");
	mstr = mstr.replaceAll("http://","");
	mstr = mstr.replaceAll("https://www.", "");
	mstr = mstr.split(".com")[0];
	mstr = mstr.split(".in")[0];
	mstr = mstr.split(".net")[0];
	mstr = mstr.split(".org")[0];
	mstr = mstr.split(".uk")[0];
	mstr = mstr.split(".eu")[0];
	mstr = mstr.split(".ac.in")[0];
	System.out.println(mstr);
	int fullLength = mstr.length();
	String modifiedString = mstr.replaceAll("\\p{Punct}","");
	int modStringLength = modifiedString.length();
	int numberOfSpecialChars = fullLength - modStringLength;
	//number of tokens in domain
	System.out.println("The number of tokens in the domain are");
	
	System.out.println(numberOfSpecialChars);
	System.out.println("");
	if(numberOfSpecialChars>3)
	System.out.println("Probably Phishing site");
	
	
	
	
	//number of dots in domain
	
 int ctr=0;
	String newstr=mstr;
			for(int i=0;i<newstr.length();i++)
			{ if(newstr.charAt(i)=='.')
			   {ctr = ctr+1;}}
			System.out.println("number of dots in the domain of the URL");
			System.out.println(ctr);
			if(ctr>=4)
			{
				System.out.println("Probably Phishing");
			}
			/*ctr=0;
mstr=mstr.replaceAll(".", "");
		 String sb=mstr;
		    
		    sb.toCharArray();
		    for(int i=0;i<sb.length();i++)
		    {
		            
		  ctr=ctr+1;
		    }
		        System.out.println("The digits present in the domain");
		        System.out.println(ctr);
		        
		        
		        if(ctr>4)
		        {
		        	System.out.println("Probably Phishing");
		        }}
		    


			  */
			}
	

public static String url()
{
	return str;
}

public static String mstr()
{ 
	return mstr;
}


}

