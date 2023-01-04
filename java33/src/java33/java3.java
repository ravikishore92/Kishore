package java33;
import java.io.*;
import java.util.*;
public class java3 {

	public static void main(String[] args) throws IOException{
		int n1,p1=1;
		char p2='A';
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n1=Integer.parseInt(br.readLine());
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=n1;j++) {
				if (j>=n1-i+1) {
					System.out.print(p1+" ");
					p1++;
				}
				else {
					System.out.print("  ");
				}
			}
			for (int k=2;k<=n1;k++) {
				if (k<=i) {
					System.out.print(p2+" ");
					p2++;
				}
			}
			p1=1;
			System.out.println();
			
		}

	}

}
