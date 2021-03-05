package GerenciaEstoque;

public class ProdutoUnidade extends Produto{

    private int prodUnidade;

    public ProdutoUnidade(int codigo, String nome, String descricao, double quantidade, double preco, int prodUnidade){
        super(codigo, nome, descricao, quantidade, preco);
        this.prodUnidade = prodUnidade;
    }

    public String toString() {
        return super.toString() + "Produto Vendido por Unidade: "
                + prodUnidade;
    }

    public int getPordUnidade() {
        return prodUnidade;
    }

    public void setProdUnidade(int prodUnidade) {
        this.prodUnidade = prodUnidade;
    }
    
}
