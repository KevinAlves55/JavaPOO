
public class Carro {
	
	// Construtor
	
	public Carro() {
		
		chassi = 88846885;
		marca = "Ford";
		velocidadeMaxima = 200;
		
	}
	
	public Carro(int c, String m, int v) {
		
		chassi = c;
		marca = m;
		velocidadeMaxima = v;
		
	}
	
	// Atributos
	int chassi;
	String marca;
	int velocidadeMaxima;
	
	// Métodos
	void buzina() {
		
		System.out.println("Beep Beep");
	
	}
	
	void roncoMotor() {
		
		System.out.println("Vruuumm");
		
	}
	
	void aumentarVelocidade(int valorVelocidade) {
		
		velocidadeMaxima += velocidadeMaxima;
		System.out.println("Velocidade Nova: " + velocidadeMaxima);
		
	}
	
	int exibirVelocidade() {
		
		return velocidadeMaxima;
		
	}
	
	String exibirMarca() {
		
		return this.marca;
		
	}

}
