package sistemaSolar;

public class Planeta extends CuerpoCeleste{
	//atributos
	double periodoOrbital;
	double velocidadOrbital;
	double radioOrbital;
	double periodoRotacional;
	String composicionAtmosfera;
	
	public Planeta(String nombre, double diametro, double superficie, double volumen, double masa, double densidad,
			double gravedad, double temperatura, double periodoOrbital, double velocidadOrbital, double radioOrbital,
			double periodoRotacional , String composicionAtmosfera) {
		super(nombre, diametro, superficie, volumen, masa, densidad, gravedad, temperatura);
		this.periodoOrbital = periodoOrbital;
		this.velocidadOrbital = velocidadOrbital;
		this.radioOrbital = radioOrbital;
		this.periodoRotacional = periodoRotacional;
		this.composicionAtmosfera = composicionAtmosfera;
	}
	
	
	public String toString(){
		return composicionAtmosfera;
		
	}
	
	

}
