package ifscpro;

public class Produto {
	
	private String Nome;
    private Long CodigoBarras;
    private Double Preco;
    private String Fornecedor;
	
    public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Long getCodigoBarras() {
		return CodigoBarras;
	}
	public void setCodigoBarras(Long codigoBarras) {
		CodigoBarras = codigoBarras;
	}
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	public String getFornecedor() {
		return Fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
	
}   
     
