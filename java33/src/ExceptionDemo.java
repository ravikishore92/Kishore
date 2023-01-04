
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=4,b=0;
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println("Divide by zero");
		}

	}

}
