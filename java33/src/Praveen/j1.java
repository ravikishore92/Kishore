package Praveen;
import java33.*;
import java.io.*;
public class j1 {
   public static void main(String praveen[]) throws IOException
   {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    int a=Integer.parseInt(br.readLine()),b=Integer.parseInt(br.readLine());
	    bw.write(arithmetic.sum(a, b)+"");
	    bw.flush();   
   }
}
