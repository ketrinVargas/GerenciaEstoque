package GerenciaEstoque;

public class CategoriaProduto extends Produto {

    private int prodUnidade;
    private float prodQuilo;

    public CategoriaProduto(int prodUnidade, float prodQuilo) {
        super(int codigo, String nome, String descricao, double quantidade, double preco, ArrayList<Produto> produtos);
        this.prodUnidade = prodUnidade;
        this.prodQuilo = prodQuilo;
    }

    public String toString() {
        return super.toString() + "Produto Vendido por Quilo: " + prodQuilo + "Produto Vendido por Unidade: "
                + prodUnidade;
    }

    public int getPordUnidade() {
        return prodUnidade;
    }

    public float getProdQuilo() {
        return prodQuilo;
    }

    public void setProdUnidade(int prodUnidade) {
        this.prodUnidade = prodUnidade;
    }

    public void setProdQuilo(float prodQuilo) {
        this.prodQuilo = prodQuilo;
    }

}
