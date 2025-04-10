import java.util.ArrayList;

public class Farmaceutica {

	private String nombre;
	private String direccion; 
	private String telefono;
	private ArrayList <String>medicamentosDisponibles;
	
	public Farmaceutica(String nombre, String direccion, String telefono) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.medicamentosDisponibles = new ArrayList<>();
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ArrayList<String> getMedicamentosDisponibles() {
		return medicamentosDisponibles;
	}
	public void setMedicamentosDisponibles(ArrayList<String> medicamentosDisponibles) {
		this.medicamentosDisponibles = medicamentosDisponibles;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	//Agregar medicamento disponible 
	public void agregarMedicamento(String medicamento) {
		medicamentosDisponibles.add(medicamento);
	}
	//Mostrar medicamento disponible
	public void mostrarMedicamentos() {
		System.out.println("Medicamentos disponibles en "+ nombre + ":");
		
		for (String medicamento: medicamentosDisponibles) {
			System.out.println("-"+ medicamento);
		}
	}
}
