public class Persona {
	
	private int id; // declaración atributos de la clase 
	private String nombre;
	private String apellidos;
	
	
	public Persona (int id, String nombre, String apellidos) throws Exception {
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos); // definimos Persona por medio de métodos 
		//set que validan datos lanzando excepciones si no son válidos y los asignan
	}
	
	
	public void setId (int id) throws Exception {
		if (id > 0) {
			this.id=id;
		}
		else {
			throw new Exception("El identificador debe ser un número mayor a cero");
		}
	}
	
	public int getId () {
		return id;
	}
	
	public void setNombre (String nombre) throws Exception {
		if (nombre == null || nombre.isBlank()) {
			throw new Exception("El campo de nombre no puede ser nulo ni estar vacío");
		}
		else {
			this.nombre=nombre;
		}
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setApellidos (String apellidos) throws Exception {
		if (apellidos == null || apellidos.isBlank()) {
			throw new Exception("El campo apellidos no puede ser nulo ni estar vacío");
		}
		else {
			this.apellidos=apellidos;
		}
	}
	
	public String getApellidos () {
		return apellidos;
	}
	
	/* Creamos métodos setter/getter que lancen excepciones para controlar los posibles valores
	 * a introducir.*/

}
