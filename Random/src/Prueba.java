import java.util.*;
public class Prueba {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int rpta = max(a,b,c);
	System.out.println ("El mayor es: "+ rpta);
}

public static int max(int a, int b, int c){
	if ( a > b )
		return max (a,c);
	else
		return max (b,c);
}
public static int max(int a, int b){
	if ( a > b)
		return a;
	return b;
}
}
