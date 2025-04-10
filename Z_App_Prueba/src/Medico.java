public class Medico extends Persona implements Recetable{
	
	private String especialidad;
	private String hospital;

	
	public Medico() {
	}

	public Medico(String nombre, String fechaNacimiento, String documentoIdentidad, String telefono,String direccion) {
		super(nombre, fechaNacimiento, documentoIdentidad, telefono, direccion);
	}
	
	public Medico(String nombre, String fechaNacimiento, String documentoIdentidad, String telefono,
			String direccion, String especialidad, String hospital) {
		super(nombre, fechaNacimiento, documentoIdentidad, telefono, direccion);
		
		this.especialidad= especialidad;
		this.hospital= hospital; 
	}
	
   public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getEspecialidad() {
		return especialidad;
	}
	
	//Método de la clase abstracta 
	public void mostrarInformacion() {
		System.out.println("Médico: "+ nombre+", Especialidad: "+ especialidad+ ", " + "Hospital: "+ hospital);
	}
	
	@Override
	public Receta crearReceta(Paciente paciente, String medicamento, String dosis, String indicaciones) {
	    return new Receta(medicamento, dosis, indicaciones, paciente.getNombre(), this.getNombre());
	}
}
