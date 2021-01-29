package coleccion6;

import java.util.Scanner;

public class ConversionAngulos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		/* 
		 * Esta opci�n en Java 14 se presenta en modo de �preview�. 
		 * Para que el compilador la reconozca, es necesario permitir este modo �preview�,como se explica en el siguiente tutorial:
		 * https://www.baeldung.com/java-preview-features
		 */

		String menu = """

				MEN� DE OPCIONES :
				-------------------

				(1) Convertir de grados a radianes
				(2) Convertir de radianes a grados
				(3) Salir
				""";
		System.out.println(menu);
		int opcion;
		boolean opcionCorrecta = false;
		do {
			System.out.print("Elige una opci�n del men�  >>>");
			opcion = teclado.nextInt();
			if (opcion < 1 || opcion > 3) {
				System.out.println("Por favor, elige una opci�n correcta de las que ofrece el men�");
			} else {
				opcionCorrecta = true;
			}

		} while (!opcionCorrecta);
		
		switch (opcion) {
			case 1-> {
				int grados, minutos, segundos;
				String mensaje= "\n Introducir grados, minutos y segundos seguidos, separados por espacio , sin decimales\n"+
								"Ejemplo:  >>> 30 45 55 \n  Introducir �ngulo>>> ";
				System.out.print(mensaje);
				grados=teclado.nextInt();
				minutos = teclado.nextInt();
				segundos= teclado.nextInt();
				double radianes= Utilidades.deGradosARadianes(grados, minutos, segundos);
				System.out.format( "\n El �ngulo equivalente es  %.6f radianes", radianes);
				
			}
			case 2-> {
				double radianes;
				System.out.print("\n Introduce el �ngulo en radianes >>>");
				radianes = teclado.nextDouble();
				int angulo[] = Utilidades.deRadianesAGrados(radianes);
				System.out.format( "\n El �ngulo equivalente es  %d� %d' %d''", angulo[0], angulo[1], angulo[2]);
			
			} 
			case 3-> {
				//abandonamos el programa
				System.out.println("Gracias por utilizar el programa");
				try {
					Thread.sleep(1000); //pausa de 1 segundo
				} catch (InterruptedException e ) 
						{//no hacer nada
				
						}
				teclado.close();
				System.exit(0);
			}
		}

	}

}
