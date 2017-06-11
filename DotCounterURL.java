//no error. works properly.

package Main;

public class DotCounterURL {
	public static String finalstr;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int ctr=0;
		//string that we put in.
		CapitalsCounter.main(args);
		String str=CapitalsCounter.url();
		finalstr=str;
		//removes all the front http(not reqd stuff)
		String mstr = str.replaceAll("http://www.","");
		mstr=mstr.replaceAll("http://", "");
		//replace common domains end parts
		mstr=mstr.replaceAll(".com","");
		mstr=mstr.replaceAll(".ac.in","");
		mstr=mstr.replaceAll(".in","");
		mstr=mstr.replaceAll(".org","");
		mstr=mstr.replaceAll(".uk","");
		mstr=mstr.replaceAll(".net","");
		mstr=mstr.replaceAll(".biz","");
		mstr=mstr.replaceAll(".co.in","");
		mstr=mstr.replaceAll(".eu","");
		mstr=mstr.replaceAll(".info","");
		mstr=mstr.replaceAll(".mobi","");
		
		
		for(int i=0;i<mstr.length();i++)
		{ if(mstr.charAt(i)=='.')
		   {ctr = ctr+1;}
	}
	System.out.println("number of dots in the entire URL");
		System.out.println(ctr);
		
		
		if(ctr>=4)
		{
			System.out.println("Probably Phishing");
		}
		
	//path dots	
		ctr=0;
		String string=Basicinfo.path();
		for(int i=0;i<string.length();i++)
		{ if(string.charAt(i)=='.')
		   {ctr = ctr+1;}}
		System.out.println("number of dots in the path of the URL");
		System.out.println(ctr);
		if(ctr>=4)
		{
			System.out.println("Probably Phishing");
		}
		
	}
	public static String url()
	{
		return finalstr;
	}
}
