package Main;

public class pathTokenCounter {
	public static String finalstr;
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	DotCounterURL.main(args);
	//finalstr=DotCounterURL.url();
//	String str=finalstr;

	String mstr=Basicinfo.path();
	mstr=mstr.replaceAll("/", "");
	System.out.println(mstr);
	
	   int fullLength = mstr.length();
	String modifiedString = mstr.replaceAll("\\p{Punct}","");
	int modStringLength = modifiedString.length();
	int numberOfSpecialChars = fullLength - modStringLength;
	System.out.println("Number of special characters in the path of the url");
	System.out.println(numberOfSpecialChars);
	
	if(numberOfSpecialChars>3)
		System.out.println("Probably Phishing site");
	else
		System.out.println("Acceptable number of tokens. Probably genuine site.");
}
	
}
