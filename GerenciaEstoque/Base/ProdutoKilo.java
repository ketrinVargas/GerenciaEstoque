package GerenciaEstoque.Base; 

public class ProdutoKilo extends Produto{
    private double quantidade;

    // quantidade ainda esta como atributo

    public ProdutoKilo(int codigo, String nome, String descricao,  double preco, double  quantidade){
        super(codigo, nome, descricao, preco);
        this.quantidade = quantidade;
    }

    public String toString() {
        return super.toString() + "Quantidade por quilo: "
                + quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double  quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
