package Main;
//logger class

//this prog checks phishtank and stores the webpg in a log file that it creates
//

//works properly
import java.io.*;  
import java.net.*;
//import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


import org.apache.commons.io.FileUtils;
import org.apache.commons.*;
import com.mysql.jdbc.StringUtils;

@SuppressWarnings("unused")
public class PhishTankBlackList {
	public static String s;
public static String str;

    public static void main(String args[]) throws Exception {
    
    	     
    	    // TODO Auto-generated method stub
    	
    	OnlinePhishCheck.main(args);
    	str=OnlinePhishCheck.url();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyyHH,mm,ss");
    	String string  = dateFormat.format(new Date());
    	string = string + ".html";
    	//String str = timestamp;
    	s=(new StringBuilder()).append("C:/Users/padma/Desktop/MINI/").append(string).toString();
    	//we put our file name(that is the timestamp of generation) into the directory MINI located on my desktop.
	    System.out.println(s);
    	
    	OutputStream out = new FileOutputStream(s);
       // "C:/Users/padma/Desktop/MINI/myfile.txt"
    	
    	
    	String urlstring=(new StringBuilder()).append("http://checkurl.phishtank.com/checkurl/index.php?url=").append(str).toString();  

    	URL url=new URL(urlstring);  
        URLConnection conn = url.openConnection();
        conn.connect();
        InputStream inp = conn.getInputStream();
        copy(inp, out);
        inp.close(); 
        out.close();
        //
        System.out.println("Created a log file of the phishtank results");
        System.out.println("Please access C:/Users/padma/Desktop/MINI ");
        System.out.println(" ");
        byte[] encoded=Files.readAllBytes(Paths.get(s));
        String finalstring=new String(encoded,StandardCharsets.UTF_8);
        //System.out.println(finalstring);
        Pattern check = Pattern.compile("<verified>");
        
        
        
   
        //		}
       // }
        
        
     //   System.out.println(check);
        
      
    }
/*
    
A byte is 8 bits and also it is in binary.

A byte array is an array of byte. so, here, we make byte array which has 4096 byte.

In order to store byte array collection we use binary data, 
like the contents of a file. 
The disadvantage is that the entire file 
contents must be loaded into memory at the same time.
}*/
    private static void copy(InputStream from, OutputStream to) throws IOException {
        byte[] buffer = new byte[4096];
        while (true) {
            int numBytes = from.read(buffer);//we are reading buffer from the website source
            if (numBytes == -1) {
                break;
            }
            to.write(buffer, 0, numBytes);//(from, 0, from.size)
            
        }
    
        
    }
    

 
    public static String url()
    {
    	return str;
    } 
}
