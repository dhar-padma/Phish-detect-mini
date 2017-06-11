package Main;
//this prog goes to phishtank and displays the stuff in the console
import java.io.*; 
import javax.swing.text.html.HTML.Tag; 
import java.net.*;  
@SuppressWarnings("unused")
public class OnlinePhishCheck {  
	
	public static String str;
	
public static void main(String[] args) throws Exception{  
	
	Connecttosql.main(args);
	str=Linking.url();
	 System.out.println(" ");
	 System.out.println("str");
	System.out.println("Phishtank checker");
	System.out.println(str);
	String s=(new StringBuilder()).append("http://checkurl.phishtank.com/checkurl/index.php?url=").append(str).toString();  
try{  
	 System.out.println("Connecting to phishtank... ");
URL url=new URL(s);  
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i,p;  
while((i=stream.read())!=-1){ 

		
System.out.print((char)i);  
}  
}catch(Exception e){System.out.println(e);}  

}


public static String url()
{
	return str;
}
}