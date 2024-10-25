package TEST;
import MODELO.PACIENTE;
import MODELO.MEDICO;

public class MAIN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PACIENTE paciente1 = new PACIENTE("Jose" , "Perez" , 1.90f , 80f);
		PACIENTE paciente2 = new PACIENTE("Jorge" , "Fernandez" , 1.60f , 60f);
		MEDICO medico = new MEDICO("Daniel", "Lopez", "Ginecologo");
		
		System.out.println("Medico: " + medico.getNombre()+ " " + medico.getApellido());
		System.out.println("Paciente " + paciente1.getNombre()+ " " + paciente1.getApellido() + ": " + medico.calcularIMC(paciente1));
		System.out.println("Paciente " + paciente2.getNombre()+ " " + paciente2.getApellido() + ": "+ medico.calcularIMC(paciente2));
	}

}