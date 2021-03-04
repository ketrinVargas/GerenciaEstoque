package GerenciaEstoque;

public class CategoriaProduto {

    private int prodUnidade;
    private float prodQuilo;

    public CategoriaProduto(int prodUnidade, float prodQuilo) {
        this.prodUnidade = prodUnidade;
        this.prodQuilo = prodQuilo;
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
