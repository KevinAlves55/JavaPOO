public class Principal {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		Carro evoque = new Carro(500, "Land Rover", 300);

		System.out.println("\n Chassi: " + fusca.chassi);
		System.out.println("\n Marca: " + fusca.marca);
		System.out.println("\n Velocidade Máxima: " + fusca.velocidadeMaxima);
		
		/*
		fusca.buzina();
		fusca.roncoMotor();
		fusca.aumentarVelocidade(200);
		*/
				
		System.out.println("\n Velocidade Máxima: " + fusca.velocidadeMaxima);
		System.out.println("Marca do carro: " + fusca.marca);

	}

}
