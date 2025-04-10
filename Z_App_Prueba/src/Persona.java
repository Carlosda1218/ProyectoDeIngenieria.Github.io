public abstract class Persona {
	
	protected String nombre; 
	private String fechaNacimiento;  
	private String documentoIdentidad; 
	private String telefono;
	private String direccion; 
	
	public Persona() {
		
	}
	
	public Persona (String nombre, String fechaNacimiento, String documentoIdentidad, String telefono, String direccion) {
		
		this.nombre= nombre; 
		this.fechaNacimiento=fechaNacimiento;
		this.documentoIdentidad=documentoIdentidad;
		this.telefono=telefono;
		this.direccion= direccion; 
	}

	public String getNombre() {
		return nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getDocumentoIdentidad() {
		return documentoIdentidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion= direccion;
	}	
	public abstract void mostrarInformacion();
}
