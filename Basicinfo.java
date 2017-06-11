
package Main;

import java.net.*;
import java.io.*;

public class Basicinfo {
public static String name;
public static String s;
public static String authority;

	public static void main(String [] args) {
		Linking.main();
		name=Linking.url();
		System.out.println(name);
		// TODO Auto-generated method stub
     try{
    	 URL url= new URL(name);
    	 System.out.println("Details of the URL are as follows:");
    	 System.out.println(" ");
    	 System.out.println(" ");
    	 //converts from a url to a string
    	 System.out.println("URL is " + url.toString());
    	 //tells what protocol the url is following
    	 System.out.println("Protocol is " + url.getProtocol());
    	 String x=url.getProtocol();
    	 if(x.length()==5)
    	 {System.out.println("Seems like a genuine site. Secured page");}
    	 else
    	 {System.out.println("NOT A SECURE SITE. NOT RECOMMENDED");}
    	 //tells the authority(domain)
    	 System.out.println("authority is " + url.getAuthority());
    	 authority=url.getAuthority();
    	 //returns file name of the url
    	 System.out.println("file name is " + url.getFile());
    	 //	it returns the host name of the URL
    	 System.out.println("host is " + url.getHost());
    	 //tells the path of the url
    	 System.out.println("path is " + url.getPath());
    	 s=url.getPath();
    	 //return the port number of the URL. it will return -1 if the port is not specified.
    	 //it is the port number to which to connect to 
    	 System.out.println("port is " + url.getPort());
    	 System.out.println("default port is " + url.getDefaultPort());
    	 //if any query has been asked then it is showed. 
    	 //query is the part after question mark in the url
    	 System.out.println("query is " + url.getQuery());
    	 //user info if present in the url is shown
    	 System.out.println ("User Info" + url.getUserInfo ());
    	 //getting references
    	 System.out.println("ref is " + url.getRef());
    	 System.out.println(" ");
     }catch(IOException e) 
     //if openconnection fails so we put it as catch
     //here we are still kepping it as we have declared an url
     {
    	 e.printStackTrace();
     }
	}
	public static String url()
	{
		System.out.println(name);
		return name;
	}

	public static String path()
	{
		
		return s;
	}
}
