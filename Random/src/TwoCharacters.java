import java.util.Scanner;

public class TwoCharacters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
        
        String s=in.next();
        int n= s.length();
        //String que sera nuestra respuesta final
        String res="";
        //Iteraicon para comparar con cada par de palabras existentes
        for(int i=0;i<26;i++){
            for(int j=i+1;j<26;j++){
            	//se haran combinaciones de a con todas las letras posteriores a ella
                char a=(char)('a'+i);
                char b=(char)('a'+j);
                //Var para guardar la concatenacion conformada por las 2 letras
                String cur="";
                //Si encuentra dentro de s a o b entonces las concatena en orden
                for(int k=0;k<n;k++){
                    if (s.charAt(k)==a || s.charAt(k)==b) {
                        cur+=s.charAt(k);
                    }
                }
                //Para descartar si la cadena es menor que la actual. si es asi sigue buscando
                if (cur.length()<res.length()) {
                	continue;
                	}
                //Metodo para saber si el valor actual de cur puede ser correcta
                if (isGood(cur)) 
                	res=cur;
            }
        }
        System.out.println(res.length()+"   =    "+res);
		

	}

	public static boolean isGood(String s){
		//Tienen que ser minimo 2 letras
        if (s.length()==1) 
        	return false;    
        return true;
    }
}
