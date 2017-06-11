//all done. no errors.
//counts how many capitals are there in the entire url(excludes http)
//threshold value assumed as 4

package Main;

public class CapitalsCounter {
	public static String finalstr;
	public static void main(String[] args) throws Exception {
		//make a counter variable that counts how many capitals are thr.
		int ctr=0;
		DomainTokensCounter.main(args);
		finalstr=DomainTokensCounter.url();
		String str = finalstr;
		//in mstr, we replace the www with nothing. No of characters lessens.
		String mstr = str.replaceAll("http://www.","");
		//some websites have the www but some phishing dont have it, so exception for that as well.
	    mstr = str.replaceAll("http://","");
	    mstr= str.replaceAll("https://www.", "");
	    
		{
		for(int i=0;i<mstr.length();i++)
		{ if(Character.isUpperCase(mstr.charAt(i))){
			ctr=ctr+1;
		}
	    }
		System.out.println("The number of capitals in the entire URL is");
		System.out.println(ctr);
		
		//threshold value set to 4.
		if(ctr>=4)
		{
			System.out.println("Probably Phishing or a directed page");
		}
		/*ctr=0;
		//paths capital letters
		System.out.println("Number of capitals in the path");
		String string=Basicinfo.path();
		for(int j=0;j<string.length();j++)
		{ if(Character.isUpperCase(string.charAt(j))){
			ctr=ctr+1;
		}
		System.out.println(ctr);
		if(ctr>=4)
		{
			System.out.println("Probably Phishing");
		}*/
		/*
		ctr=0;
		String stri=DomainTokensCounter.mstr();
		System.out.println(mstr);
		System.out.println("Number of capitals in the domain");
		for(i=0;i<stri.length();i++)
		{ if(Character.isUpperCase(stri.charAt(i))){
			ctr=ctr+1;
		}
		System.out.println(ctr);
		if(ctr>=4)
		{
			System.out.println("Probably Phishing");
		}
		}*/
}}
	//}
	public static String url()
	{
		return finalstr;
	}}
