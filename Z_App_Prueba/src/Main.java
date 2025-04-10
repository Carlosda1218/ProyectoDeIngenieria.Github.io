import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ================================
        // Inicializar Historial Médico
        // ================================
        ArrayList<String> medicamentosActuales = new ArrayList<>();
        ArrayList<String> alergias = new ArrayList<>();
        ArrayList<String> cirugias = new ArrayList<>();
        ArrayList<String> enfermedades = new ArrayList<>();

        HistorialMedico historialMedico = new HistorialMedico("A-",enfermedades,alergias,cirugias,medicamentosActuales,"Gripe");

        // Agregar datos al historial médico
        
        historialMedico.addEnfermedades("Diabetes");
        historialMedico.addEnfermedades("Hipertensión");
        historialMedico.addAlergias("Polen");
        historialMedico.addCirugias("Apéndice");
        historialMedico.addMedicamentosActuales("Metformina");
        historialMedico.addMedicamentosActuales("Lorasatán");

        // Crear Paciente y asignar datos
        
        Paciente paciente = new Paciente("Carlos","18/12/2006","N06960090","556749384","Calle Lozoya, Chamberí");

        paciente.setAseguradora("Sanitas");
        paciente.setPoliza("88HDHFB4739HD");

        // Crear Médico
        
        Medico medico = new Medico("Dr Torres","18/12/1970","Z5456443","5556433456","Calle xx","Cardiologia","Hospital UEM");

        // Crear Farmacéutica
        
        Farmaceutica farmacia = new Farmaceutica("Farmacia Madrid","Calle 777, Ciudad Madrid","123456789");

        // Agregar medicamentos a la farmacia
        
        farmacia.agregarMedicamento("Paracetamol");
        farmacia.agregarMedicamento("Ibuprofeno");

  
        // Crear Receta y asociar Farmacéutica
        
        Receta receta = medico.crearReceta(paciente, "Paracetamol", "500mg", "Tomar cada 8 horas");
        receta.asociarFarmaceutica(farmacia);

        // Mostrar información
        
        System.out.println("\n--- Medicamentos disponibles en la farmacia ---");
        farmacia.mostrarMedicamentos();

        System.out.println("\n--- Receta médica ---");
        receta.mostrarReceta();

        System.out.println("\n--- Información del Médico ---");
        medico.mostrarInformacion();

        System.out.println("\n--- Información del Paciente ---");
        paciente.mostrarInformacion();

        System.out.println("\n--- Historial Médico del Paciente ---");
        historialMedico.mostrarHistorial();
    }
}
