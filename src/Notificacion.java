
	/*Creamos la clase abstracta Notificación, definimos los atributos y métodos de dicha clase que serán heredados 
	 * por las clases hijas email y SMS. Añadimos el método abstracto enviar que será definido en las subclases. 
	 * Hemos añadido encapsulamiento a los atributos por medio del modificador de acceso private, lo que solventamos 
	 * en las clases hijas creando dos métodos get que nos permitirán acceder a ellos. Por último, también añadimos
	 * el modificador de acceso proteted al constructor, que aunque obviamente no se vaya a usar en el main, 
	 * nos permite llamarlo desde las clases hijas.*/


public abstract class Notificacion {

	private String destinatario;
	private String mensaje;
	
	protected Notificacion (String destinatario, String mensaje) {
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}
	
	public void mostrarVistaPrevia () {
		System.out.println("Mensaje para: " + destinatario);
		System.out.println(mensaje);
		 
	}
		
	public String getDestinatario () {
		return destinatario;
	}
	
	public String getMensaje () {
		return mensaje;
	}
	
	public abstract void enviar();
	
	
}
