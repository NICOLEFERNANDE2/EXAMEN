package MODELO;


public class MEDICO {
	private String nombre;
	private String apellido;
	private String especialidad;
	
	public MEDICO(String nombre, String apellido, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public float calcularIMC(PACIENTE paciente) {
		
		float peso = paciente.getPeso();
		float estatura = paciente.getEstatura();
		float Resultado = peso / (estatura * estatura);
		return Resultado;
		
		
	}
	
	

}
