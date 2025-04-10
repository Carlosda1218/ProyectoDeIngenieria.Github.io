public class Receta {

	private String medicamento;
	private String dosis;
	private String indicaciones; 
	private String nombrePaciente;
	private String nombreMedico;
	private Farmaceutica farmaceutica;
	
	
	public Receta() {
	}
	
	public Receta(String medicamento, String dosis, String indicaciones, String nombrePaciente, String nombreMedico) {
		this.medicamento = medicamento;
		this.dosis = dosis;
		this.indicaciones = indicaciones;
		this.nombrePaciente = nombrePaciente;
		this.nombreMedico = nombreMedico;
	}
	
	public String getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getIndicaciones() {
		return indicaciones;
	}
	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public String getNombreMedico() {
		return nombreMedico;
	} 
//mostrar receta
	
	public void mostrarReceta() {
		
		System.out.println("Receta Médica:");
		System.out.println("Paciente: "+ nombrePaciente);
		System.out.println("Medicamento: "+ medicamento);
		System.out.println("Dosis: "+ dosis);
		System.out.println("Indicaciones: "+ indicaciones);	
		System.out.println("Médico: "+ nombreMedico);
		if (farmaceutica!= null) {
			System.out.println("Farmaceutica:"+ farmaceutica.getNombre());
		}
	}	
	//Asociar farmacia con receta
	public void asociarFarmaceutica(Farmaceutica farmaceutica) {
		this.farmaceutica= farmaceutica;	
		}
	}
