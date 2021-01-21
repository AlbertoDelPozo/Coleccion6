package coleccion6;
import java.util.Scanner;


public class ProbarApuestaPrimitiva {

	public static void main(String[] args) {
		//generar apuestas a la primitiva
		Scanner teclado= new Scanner (System.in);
		int apuestas;
		
		do{
		     System.out.println("Introduce el n�mero de apuestas que deseas, m�ximo 100");
		     apuestas= teclado.nextInt();
		} while (apuestas<1 || apuestas >100);
		
		//inicializamos un array con el n�mero de apuestas indicado
		int [][] combinaciones= new int[apuestas][7];
		
		for (int i=0; i<apuestas; i++)
			combinaciones[i] = Utilidades.apuestaPrimitiva();
		
		// por �ltimo, imprimimos todas las combinaciones
		for (int i=0; i<apuestas; i++){
			System.out.print("\nApuesta " + (i+1));
			
			for (int j=0; j<7; j++)
				System.out.format("\t %2d", combinaciones[i][j]);
		} // fin del recorrido del array
		
		teclado.close();
		}
		
		

	}


