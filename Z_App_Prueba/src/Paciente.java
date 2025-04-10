public class Paciente extends Persona  {

	private String poliza;
	private String aseguradora; 
	private HistorialMedico historialMedico;

	
	
	public Paciente () {
	}

	public Paciente(String nombre, String fechaNacimiento, String documentoIdentidad, String telefono,
			String direccion) {
		super(nombre, fechaNacimiento, documentoIdentidad, telefono, direccion);
	}
	
	public Paciente(String nombre, String fechaNacimiento, String documentoIdentidad, String telefono,
			String direccion, String poliza, String aseguradora, String historialMedico) {
		super(nombre, fechaNacimiento, documentoIdentidad, telefono, direccion);
		
		this.poliza= poliza;
		this.aseguradora= aseguradora; 
		this.historialMedico= new HistorialMedico();	
	}

	
	public String getPoliza() {
		return poliza;
	}
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}
	public String getAseguradora() {
		return aseguradora;
	}
	public void setAseguradora(String aseguradora) {
		this.aseguradora = aseguradora;
	}
	public HistorialMedico getHistorialMedico() {
		return historialMedico;
	}
	public void setHistorialMedico(HistorialMedico historialMedico) {
		this.historialMedico = historialMedico;
	}
	
	//ver historial médico
	public void verHistorial() {
		historialMedico.mostrarHistorial();
	}
	//Método de la clase abstracta
	public void mostrarInformacion() {
			System.out.println("Paciente: "+ nombre+", Póliza: "+ poliza+ " ,"+ "Aseguradora:" +aseguradora);
	}
}
