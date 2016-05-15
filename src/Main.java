import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter three numbers:");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a>b && a>c){
			System.out.println(a + " is the biggest number.");
		}else if(b>a && b>c){
			System.out.println(b + " is the biggest number.");
		}else if(c>a && c>b){
			System.out.println(c + " is the biggest number.");
		}else{
			System.out.println("The numbers are equal.");
		}

	}

}
