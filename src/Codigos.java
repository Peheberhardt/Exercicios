import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Codigos {

	public static void Ex1() {

		int i = 13;
	    int soma = 0;
	    int k = 0;
	    
	    while (k < i){
	        k = k+1;
	        soma = soma+k;
	    }
	    System.out.println(soma);
	}
	
	public static int Ex2(int num) {
		if(num < 2) {
			return num;
		}
		else {
			return Ex2(num-1) + Ex2(num-2);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		//Exercicio 1
		
		//{
			//Ex1();
		//}
		
		
		
		
		//Exercicio 2
//		{
//			int num = 13;
//				
//			for(int i = 0; i < num; i++) {
//				int en = Ex2(i);
//				if(en != num) {
//					System.out.println(en+ "");
//				}
//					
//				if(en == num) {
//					System.out.println(en+ " - O numero pertence a sequencia");
//				}
//			}
//		}
		
		
		
		//Exercicio 3 
//		{
//			Nao consegui resolver
//		}
		
		
		
		
			
			
		//Exercicio 4 
//		{	
//			double[] percentual= new double[5];
//			double soma = 0;
//			double[] estados = {67836.43,36678.66,29229.88,27165.48,19849.53};
//			
//			for(int i = 0; i < estados.length; i++) {
//				soma += estados[i];
//			}
//			
//			for(int i = 0; i < estados.length; i++) {
//				percentual[i] = estados[i] * 100 / soma;
//			}
//			
//			for(int i = 0; i< estados.length; i++) {
//				System.out.println();
//				if(i == 0) {
//					System.out.println("SP: "+Math.round(percentual[i])+"%");
//				} else if(i == 1) {
//					System.out.println("RJ: "+Math.round(percentual[i])+"%");
//				}else if(i == 2) {
//					System.out.println("MG: "+Math.round(percentual[i])+"%");
//				}else if(i == 3) {
//					System.out.println("ES: "+Math.round(percentual[i])+"%");
//				}else if(i == 4) {
//					System.out.println("Outros: "+Math.round(percentual[i])+"%");
//				}
//			}
//			
//		}
		
		
		
		
		
		//Exercicio 5
		
//		{
//			String frase = "Joguei videogames ontem";
//			
//			char[] fraseReversa = frase.toCharArray();
//			
//			String novaFrase;
//			
//			for(int i = fraseReversa.length-1; i >= 0;i--) {
//				System.out.print(fraseReversa[i]);
//			}
//			
//		}
		
		
        
	}

}
