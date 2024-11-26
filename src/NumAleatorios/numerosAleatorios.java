package NumAleatorios;

import java.util.Random;

public class numerosAleatorios {

	public static void main(String[] args) {

		Random random = new Random();
		  for (int i = 0; i < 20; i++) {
			  int numeroAleatorio = random.nextInt(10) + 1;
		      System.out.println(numeroAleatorio);
		      }
	}
}


