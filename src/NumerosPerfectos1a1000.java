
public class NumerosPerfectos1a1000 {

	public static void main(String[] args) {
		//Calcular cuantos numeros perfectos hay del 1 al 1000.
		
		 int contador = 0;
		 
		 for(int i = 1; i <= 1000; i++) {
			 for(int j = i; j< i; j++) {
				 int numP = 0;
				 if(i%j == 0) {
					 numP = numP +j;
				 }
				 if(numP == i) {
					 contador ++;
				 }
			 }
		 }
		
		
		
		
		System.out.println("Entre el 1 y el 1000 hay " + contador + " Numeros perfectos");	
	
	
	}
	
}
