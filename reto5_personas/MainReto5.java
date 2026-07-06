import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class MainReto5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			ArrayList<Persona> personas = new ArrayList<>();
			int contador = 1;

			/* Creamos un ArrayList para almacenar la clase Persona. Como el usuario es susceptible de introducir
			 * valores no permitidos, lo que hacemos es declarar una variable int como contador, que nos va a servir
			 * para iniciar un bucle que repetirá el bloque hasta que el contador llegue a 3. 
			 * La idea del bloque dentro del bucle es que mientras se cree un objeto persona correctamente 
			 * no saltará el catch por lo que contador sumará 1 a su valor. Por otro lado, si el usuario introduce
			 * un dato no válido, el catch lo capturará antes de que se pueda ejecutar la línea contador++.*/
			
			
				while (contador <= 3) {
					try {
						
						System.out.println("Introduce el número ID de la persona número " + contador);
						int id = scanner.nextInt();
						scanner.nextLine();
						
						System.out.println("Introduce el nombre de la persona número " + contador);
						String nombre = scanner.nextLine();
						
						System.out.println("Introduce los apellidos de la persona número " + contador);
						String apellidos = scanner.nextLine();
						
						Persona persona = new Persona(id, nombre, apellidos);
						personas.add(persona);
						contador++;
						
						System.out.println("Persona añadida correctamente");

					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage()+ "\n");
						System.out.println("Vuelve a comenzar\n");
						scanner.nextLine(); // Limpiamos el buffer para que no entre en un bucle infinito en el nextInt
						
					}			
				} 
				scanner.close();
		
		}

	}


