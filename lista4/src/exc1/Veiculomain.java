package exc1;

import java.util.ArrayList;

public class Veiculomain {
	
	public static void main(String[] args) {
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		Veiculo v1 = new Veiculo();
		 
		 v1.setNome("Siena");
		 v1.setAno(2012);
		 v1.setFabricante("Fiat");
		 v1.setNrodas(4);
		 v1.setCor("Vermelho");
		 veiculos.add(v1);
		 
		 Veiculo v2 = new Veiculo();
		 
		 v2.setNome("Corolla");
		 v2.setAno(2015);
		 v2.setFabricante("Toyota");
		 v2.setNrodas(4);
		 v2.setCor("Prata");
		 veiculos.add(v2);
		 
		 Veiculo v3 = new Veiculo();
		 
		 v3.setNome("Lambretta");
		 v3.setAno(1963);
		 v3.setFabricante("Lambretta");
		 v3.setNrodas(2);
		 v3.setCor("Azul");
		 veiculos.add(v3);
		 
		 for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getNrodas());
			System.out.println(veiculo.getCor());
		}
		 
		 
		 
		 
	}

}
