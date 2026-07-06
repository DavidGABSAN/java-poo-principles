public class Email extends Notificacion{ //Email extiende Notificacion, heredando comportamiento
	//público y protegido, y añadiendo otros propios
	
	private String asunto; //encapsulamos asunto, atributo propio de email

	
	protected Email(String destinatario, String mensaje, String asunto) {
		super(destinatario, mensaje); //inicializamos los atributos heredados mediante el constructor de la superclase
		this.asunto = asunto; //inicializamos atributo en el constructor
	}

	
	@Override
	public void mostrarVistaPrevia () {
		System.out.println("Correo electrónico para: " + getDestinatario());
		System.out.println("Asunto: " + asunto); 
		System.out.println(getMensaje());
	} //redefinimos mostrarVistaPrevia añadiendo el atributo propio asunto
	
	public String getAsunto () { //así podemos acceder a asunto en otras clases 
		return asunto;
	}
	
	@Override
	public void enviar() {
		System.out.println("El correo electrónico con asunto " + asunto + " y destinatario " + getDestinatario() + " se ha enviado con éxito" );
	} //hemos definido el método enviar como un mensaje que avisa que se ha enviado el correo con las peculiaridades de esta clase.
	
	public void mostrarVistaPreviaRepetida (int iterar) {
		for (int i=0; i < iterar; i++) {
			mostrarVistaPrevia();
		} /* Dada la interpretación que hago del enunciado, creo un método exclusivo de Email
		que repite el método mostrarVistaPrevia el número de veces que se establece por parámetro.*/
	}
	
	
	
	
	
}
