package GerenciaEstoque.Base; 

public class ProdutoKilo extends Produto{
    private float quantidadeKilo;

    // quantidade ainda esta como atributo

    public ProdutoKilo(int codigo, String nome, String descricao,  double preco, float quantidade){
        super(codigo, nome, descricao, preco);
        this.quantidadeKilo = quantidadeKilo;
    }

    public String toString() {
        return super.toString() + "Quantidade por quilo: "
                + quantidadeKilo;
    }

    public float getQuantidade() {
        return quantidadeKilo;
    }

    public void setQuantidade(int quantidadeKilo) {
        this.quantidadeKilo = quantidadeKilo;
    }
    
    
}
