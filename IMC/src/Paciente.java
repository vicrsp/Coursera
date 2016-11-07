
public class Paciente {

	double _peso;	
	double _altura;
	
	public Paciente(double peso, double altura ){
		_peso = peso;
		_altura = altura;
	}
	
	public double calcularIMC(){
		return (_peso/(_altura*_altura));
	}
	
	public String diagnostico(){
		
		double imc = this.calcularIMC();
		
		if(imc < 16){
			return "Baixo peso muito grave";
		}else 
			if (imc < 17){
				return "Baixo peso grave";
			}else 
				if(imc < 18.5){
					return "Baixo peso";
				}else 
					if (imc < 25){
						return "Peso normal";
					}else
						if (imc < 30){
							return "Sobrepeso";
						}else 
							if(imc < 35){
								return "Obesidade grau I";
							}else 
								if(imc < 40){
									return "Obesidade grau II";
								}else {
									return "Obesidade grau III (obesidade mórbida)";
									}
	} 
	
	
	public static void main(String[] args) {
		Paciente p1 = new Paciente(150*Math.random() + 50,Math.random() + 1.2);
		Paciente p2 = new Paciente(150*Math.random() + 50,Math.random() + 1.2);
		Paciente p3 = new Paciente(150*Math.random() + 50,Math.random() + 1.2);
		
		System.out.println("Paciente 1. IMC = " + p1.calcularIMC());
		System.out.println("Diagnóstico: " + p1.diagnostico());
		
		System.out.println("Paciente 2. IMC = " + p2.calcularIMC());
		System.out.println("Diagnóstico: " + p2.diagnostico());
		
		System.out.println("Paciente 3. IMC = " + p3.calcularIMC());
		System.out.println("Diagnóstico: " + p3.diagnostico());
		
		
	}

}
