package Base;

public class ProdutoKilo extends Produto{
    private float quantidade;

    // quantidade ainda esta como atributo

    public ProdutoKilo(int codigo, String nome, String descricao, float quantidade, double preco, int prodUnidade){
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }

    public String toString() {
        return super.toString() + "Quantidade: "
                + quantidade;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
