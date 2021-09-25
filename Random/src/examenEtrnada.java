import java.util.ArrayList;

public class examenEtrnada {

	public static void main(String args[]) {
		String x = funcion("word");
		System.out.print(x);
		
	}

	public static String funcion (String str) {
		String cad = "";
		for(int i = 0; i<str.length();i++) {
			cad = cad+str.charAt(i)+str.charAt(i);
		}
		return cad;
	}
}
