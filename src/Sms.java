public class Sms extends Notificacion { /*como con Email, Sms extiende Notificacion,
 heredando comportamiento público y protegido, y añadiendo otros propios*/
	private String numeroTelefono;//encapsulamos numeroTelefono, atributo propio de Sms

	protected Sms(String destinatario, String mensaje, String numeroTelefono) {
		super(destinatario, mensaje);
		this.numeroTelefono = numeroTelefono;
	}/*inicializamos los atributos heredados mediante el constructor de la superclase
	 e inicializamos el atributo numeroTelefono en el constructor*/
	
	public String getNumeroTelefono () {
		return numeroTelefono;
	} //así podemos acceder a numeroTelefono en otras clases 
	
	@Override
	public void mostrarVistaPrevia () {
		System.out.println("SMS para: " + getDestinatario());
		System.out.println("Número de teléfono: " + numeroTelefono);
		System.out.println(getMensaje());
	}//redefinimos mostrarVistaPrevia añadiendo el atributo propio numeroTelefono

	@Override
	public void enviar() {
		System.out.println("El SMS " + "'" + getMensaje() + "'" + " se ha enviado a " + getDestinatario() + " con número " + numeroTelefono);
		/*el método enviar muestra en pantalla el mensaje que se ha enviado con las particularidades 
		 * de la clase Sms. He decidido que el SMS muestre el mensaje completo al enviarse ya que al
		 * no existir asunto en Sms ayuda a diferenciarlo en el main después*/
	}

}
