package Base;

public class ProdutoUnidade extends Produto{

    private int quantidade;

    // quantidade ainda esta como atributo

    public ProdutoUnidade(int codigo, String nome, String descricao,int quantidade, double preco, int prodUnidade){
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }

    public String toString() {
        return super.toString() + "Quantidade: "
                + quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
