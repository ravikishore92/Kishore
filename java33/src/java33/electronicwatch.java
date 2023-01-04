package java33;
import java.io.*;
import java.util.*;
public class electronicwatch {
		public static void main(String[] args) throws IOException {
			int sec;
			System.out.println("Enter secs");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			sec=Integer.parseInt(br.readLine());
			int h,mm;
			mm=sec/60;
			sec=sec%60;
			h=mm/60;
			mm=mm%60;
			h=h%24;
			System.out.println(h+":"+mm+":"+sec);
			
		}
}
