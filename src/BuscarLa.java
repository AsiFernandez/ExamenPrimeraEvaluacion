import java.util.Scanner;

public class BuscarLa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero ");
		String frase = scan.nextLine();
		
		for(int i = 0; i< frase.length(); i++) {
			if(frase.charAt(i)== 'l' && frase.charAt(i+1) == 'a'){
				System.out.println("la aparace en la casilla " + i);
			}
		}
		
		
	}

}
