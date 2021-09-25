import java.util.Scanner;

public class tema1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int rpta = max(a,b,c);
		
		System.out.println ("El mayor es: "+rpta);
	}
	
	public static int max(int a, int b, int c) {
		
		int mayor = a;
		
		mayor = max(mayor,b);
		mayor = max(mayor,c);
		
		return mayor;
	}
	
	public static int max(int mayor, int x) {
		if(x>mayor)
			return x;
		return mayor;
	}
}
