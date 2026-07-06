/* RETO 4 - 1ºDAW
 * David Gabriel Santonja Valles
 * 
 * Es importante remarcar que he llevado a cabo esta práctica teniendo en cuenta una serie de premisas que paso
 * a comentar por encontrar cierta ambigüedad en el enunciado. 
 * 1º El "asunto" en el SMS no es correcto, ya que en este caso es atributo de EMAIL por lo que no aparecerá 
 * definido como miembro de SMS.
 * 2º “Muestra por pantalla, recibe un parámetro para mostrarlo por pantalla el número de veces…” esta frase resulta
 * muy ambigua por lo que el resultado del ejercicio se desprende de la interpretación que se puede hacer de ella.
 * Desde POO un método debe responder a una intención clara y no se percibe con total claridad desde el enunciado.*/

import java.util.ArrayList;

public class Programa {

	/*El programa principal instancia 4 objetos Email y Sms, dos de cada, a modo de ejemplo. 
	 * A continuación, los introduce en un ArrayList de tipo Notificacion, como pide el enunciado, y un bucle for-each
	 * recorre los elementos uno a uno, llamando a los métodos mostrarVistaPrevia y enviar, que se adaptan a su clase
	 * en función del tipo de objeto que los invoque (polimorfismo).*/
	
	
	public static void main(String[] args) {
		
		Email email1 = new Email("Carlos Andrés", "Necesito que me envíe los requisitos de implantación. Gracias.", "Petición informe implantación");
		Email email2 = new Email("Marta Sanchez", "Le adjunto el informe solicitado.", "Envío informe implantación");
		Sms sms1 = new Sms("Prooverdor1", "El producto ya está disponible para recoger", "+34628642519");
		Sms sms2 = new Sms("Proveedor2","Por favor, póngase en contacto con nosotros lo antes posible, gracias." , "+34639359541");
		
		ArrayList<Notificacion> mensajesList = new ArrayList<>();
		
		mensajesList.add(email1);
		mensajesList.add(sms1);
		mensajesList.add(email2);
		mensajesList.add(sms2);
		
		for(Notificacion i: mensajesList) {
			i.mostrarVistaPrevia();
			i.enviar();
		}

	}

}
