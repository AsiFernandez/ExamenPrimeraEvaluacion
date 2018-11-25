
public class DadosSacar6 {

	public static void main(String[] args) {
		
		int dado1, dado2, contador = 0;
		
		do {
			dado1 = (int) (Math.random()*6)+1;
			dado2 = (int) (Math.random()*6)+1;
			System.out.println("en el dado 1 ha salido " + dado1);
			System.out.println("en el dado 2 ha salido " + dado2);
			
			contador ++;
			
			
		}while(dado1 != 6 || dado2 != 6);
		
		
		System.out.println("Has tardado " + contador + " tiradas en sacar 6 y 6");
		
	}

}
