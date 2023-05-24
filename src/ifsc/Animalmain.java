package ifsc;

import java.util.ArrayList;

public class Animalmain {
	
	public static void main(String[] args) {
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		Animal gato = new Animal();
		
		gato.setNome("Fiona");
		gato.setRaca("Siames");
		gato.setComprimento(45.00f);
		gato.setCor("Caramelo");
		gato.setEcossistema("Casa");
		gato.setNpatas(4);
		animais.add(gato);
		
		Animal cachorro = new Animal();
		
		cachorro.setNome("Bombadao");
		cachorro.setRaca("Pitbull");
		cachorro.setComprimento(55.00f);
		cachorro.setCor("Branco");
		cachorro.setEcossistema("Casa");
		cachorro.setNpatas(4);
		animais.add(cachorro);
		
		for(Animal animal : animais) {
			System.out.println(animal.getNome());
			System.out.println(animal.getRaca());
			System.out.println(animal.getComprimento());
			System.out.println(animal.getNpatas());
			System.out.println(animal.getCor());
			System.out.println(animal.getEcossistema());
		}
		
		
		
		
				
	}

}
