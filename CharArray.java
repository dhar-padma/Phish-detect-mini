package Main;
//program chal raha hai thik se. 

public class CharArray {
public static String finalstr;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//calls function of other class called DomainBrandName for user input  
		pathTokenCounter.main(args);
		//DomainBrandName.main();
		//calls function of other class to retrieve input
		finalstr=pathTokenCounter.url();
		System.out.println("final-str " + finalstr);
		String mstr=finalstr;
		mstr = mstr.replaceAll("http://www.","");
		
		mstr = mstr.replaceAll("http://","");
		mstr = mstr.split(".com")[0];
		mstr = mstr.split(".in")[0];
		mstr = mstr.split(".net")[0];
		mstr = mstr.split(".org")[0];
		mstr = mstr.split(".uk")[0];
		mstr = mstr.split(".eu")[0];
		mstr = mstr.split(".ac.in")[0];
		String name= mstr;
		System.out.println(mstr);
	 	int len;
	 	len=name.length();
	 	System.out.println(len);
	 	System.out.println("YOU ARE AN IDIOT");
	 	//converting from a string to a character array for user input name
		char[] array1 = name.toCharArray();
	 for(int i=0; i<len; i++)
	 	{
	 		array1[i] = new Character(name.charAt(i));
	 	}
	 	System.out.println("we compare similarity of url domain with other popular site");
	 	String original= "ebay";
	 	int original_length=original.length();
	 	
	 	//converting from a string to character array for a pre decided name
	 	char[] array2 = original.toCharArray();
	for(int i=0; i<original_length; i++)
	 	{
	 		array2[i] = new Character(original.charAt(i));
	 	}
	 	
	 	int j;
	 	//create a counter that shall count how many letters are at the same posn and same character
	 	int counter = 0;
	 	//we ensure that both the strings are of same length so that they can be compared 
		for(int i=0; i<original_length; i++)
	 	{
	 		System.out.println(array2[i]);
	 	}
		System.out.println("IDIOT URRRRZ");
		for(int i=0; i<original_length; i++)
	 	{
	 		System.out.println(array1[i]);
	 	}
	 	if(original_length==len)
	 	{
	 		//int minLength = Math.min(original.length(), name.length());
	 	for(j=0; j<original_length; j++)
	 	{	
            if (array1[j] == array2[j])
	 		        {
	 		            counter++;    
	 		        }
	 	}
	 	
	 	}
	 	float p;
	 	System.out.println(counter);
	 	System.out.println(original_length);
	 	p=(float)counter/original_length;
	 	System.out.println(p);
	 	if(p>=0.5 && p<1)
	 	{System.out.println("Phishing");
	 	}
	 	else if(p==1)
	 	{System.out.println("Genuine");}
	 	else if(p<0.5)
	 	{System.out.println("Unknown");}
	 	}
	
}

	 	
	 	
	


