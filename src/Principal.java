public class Principal {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();

		System.out.println("\n Chassi: " + fusca.chassi);
		System.out.println("\n Marca: " + fusca.marca);
		System.out.println("\n Velocidade M�xima: " + fusca.velocidadeMaxima);
		
		fusca.buzina();
		
		System.out.println("\n Velocidade M�xima: " + fusca.velocidadeMaxima);

	}

}
