package ifscpro;

import java.util.ArrayList;

public class mainProduto {
	
	  public static void main(String[] args) {
		  
		  ArrayList<Produto> produtos= new ArrayList<>();
		  
		  Produto pdt1 = new Produto();
		  pdt1.setNome("Sandalia Melissa");
		  pdt1.setCodigoBarras(234765123l);
		  pdt1.setPreco(250.00);
		  pdt1.setFornecedor("Shutz");
		  
		  produtos.add(pdt1);
		  
		  Produto pdt2 = new Produto();
		  pdt2.setNome("Chinelo Slide");
		  pdt2.setCodigoBarras(321654789l);
		  pdt2.setPreco(115.00);
		  pdt2.setFornecedor("Adidas");
		  
		  produtos.add(pdt2);
		  
		  Produto pdt3 = new Produto();
		  pdt3.setNome("Tenis Old Skool");
		  pdt3.setCodigoBarras(213453765l);
		  pdt3.setPreco(399.99);
		  pdt3.setFornecedor("Vans");
		  
		  produtos.add(pdt3);
		  
		  for(Produto produto: produtos) {
              System.out.println(produto.getNome());
              System.out.println(produto.getCodigoBarras());
              System.out.println(produto.getPreco());
              System.out.println(produto.getFornecedor());
			  
		  }
		  
		  
		  
	  }

}
