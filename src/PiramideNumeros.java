import java.util.Scanner;

public class PiramideNumeros {

	public static void main(String[] args) {
		
		//Crea una piradime con la cantidad de numeros introducida por teclado
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero ");
		int numero = scan.nextInt();
		
		for( int i = 1; i<= numero; i++){
			for(int j= 1; j<= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		//Piramide completa, hacia arriba y hacia abajo 
		//Esto no hace falta
		
		for( int i = numero; i >= 1; i--){
			for(int j = 1; j <= i-1; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
