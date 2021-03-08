package GerenciaEstoque.Base; 

public class ProdutoUnidade extends Produto{

    private int quantidadeUnidade;

    // quantidade ainda esta como atributo

    public ProdutoUnidade(int codigo, String nome, String descricao, double preco, int quantidade){
        super(codigo, nome, descricao, preco);
        this.quantidadeUnidade = quantidadeUnidade;
    }

    public String toString() {
        return super.toString() + "Quantidade por Unidade: "
                + quantidadeUnidade;
    }

    public int getQuantidade() {
        return quantidadeUnidade;
    }

    public void setQuantidade(int quantidadeUnidade) {
        this.quantidadeUnidade = quantidadeUnidade;
    }
    
}
