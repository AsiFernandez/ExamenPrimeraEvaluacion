import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		
		
		//Pedir un numero por teclado y calcular si el numero es perfecto o no.
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero ");
		int numero = scan.nextInt();
		int NumeroPerfecto  = 0;
		
		for(int i = 1; i < numero; i++ ) {
			if(numero %i == 0){
				NumeroPerfecto = NumeroPerfecto +i;
			}
		}
		
		if(NumeroPerfecto == numero) {
			System.out.println("El numero introducido es perfecto!");
		}else {
			System.out.println("El numero introducido no es perfecto!");
		}
			
	}

}
