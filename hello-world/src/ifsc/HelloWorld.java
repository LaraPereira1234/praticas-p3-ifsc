package ifsc;

import java.util.Iterator;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Viabiliza a leitura de dados
		Scanner leitura = new Scanner(System.in);
     System.out.println("Nome:");
     // Faz a leitura e guarda o conteudo em uma variavel 
     String nome = leitura.nextLine();
      
     System.out.println("Idade");
     String idadeStr = leitura.nextLine();
	
     // Converte de tipo (String para Double)
     int idade = Integer.valueOf(idadeStr);
     
     System.out.println(nome + " tem " + idade + " anos ");
		
	}

}
