import java.util.ArrayList;

public class HistorialMedico {
	
	private String grupoSanguineo;
	private ArrayList<String> enfermedades;
	private ArrayList<String> alergias;
	private ArrayList<String> cirugias;
	private ArrayList<String> medicamentosActuales;
	private String enfermedadActual;
	
	public HistorialMedico() {
	}

	public HistorialMedico(String grupoSanguineo, ArrayList<String> enfermedades, ArrayList<String> alergias,
			ArrayList<String> cirugias, ArrayList<String> medicamentosActuales, String enfermedadActual) {
		
		this.grupoSanguineo = grupoSanguineo;
		this.enfermedades = new ArrayList<>();
		this.alergias = new ArrayList<>();
		this.cirugias = new ArrayList<>();
		this.medicamentosActuales = new ArrayList<>();
		this.enfermedadActual = enfermedadActual;
	}

	public ArrayList<String> getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(ArrayList<String> enfermedades) {
		this.enfermedades = enfermedades;
	}
	public ArrayList<String> getAlergias() {
		return alergias;
	}
	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	public ArrayList<String> getCirugias() {
		return cirugias;
	}
	public void setCirugias(ArrayList<String> cirugias) {
		this.cirugias = cirugias;
	}
	public ArrayList<String> getMedicamentosActuales() {
		return medicamentosActuales;
	}
	public void setMedicamentosActuales(ArrayList<String> medicamentosActuales) {
		this.medicamentosActuales = medicamentosActuales;
	}
	public String getEnfermedadActual() {
		return enfermedadActual;
	}
	public void setEnfermedadActual(String enfermedadActual) {
		this.enfermedadActual = enfermedadActual;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}

	//Metodos extra
	//Editar Historial Medico 
	public void addEnfermedades(String enfermedad) {
		enfermedades.add(enfermedad);
	}
	public void addAlergias(String alegria) {
		alergias.add(alegria);
	}
	public void addCirugias(String cirugia) {
		cirugias.add(cirugia);
	}
	public void addMedicamentosActuales(String medicamentoActual) {
		medicamentosActuales.add(medicamentoActual);
	}
	//Mostrar Historial
	public void mostrarHistorial(){
		System.out.println("Historial Médico: ");
		System.out.println("Grupo Sanguíneo"+ grupoSanguineo);
		System.out.println("Enfermedades: "+ enfermedades);
		System.out.println("Alergias: "+ alergias);
		System.out.println("Cirugias: "+ cirugias);
		System.out.println("Medicamentos Actuales: "+ medicamentosActuales);
		System.out.println("Enfermedad Actual"+ enfermedadActual);
	}
}
