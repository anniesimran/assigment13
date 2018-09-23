import java.io.*;
public class ReadFromFile2 {
    public static void main(String[] x)throws Exception
     {
    	 File file = new File("F:\\demo.txt"); 
    	  
    	  BufferedReader br = new BufferedReader(new FileReader(file)); 
    	  
    	  String st; 
    	  while ((st = br.readLine()) != null) 
    	    System.out.println(st); 
    }
}

