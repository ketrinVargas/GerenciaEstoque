package Base;

public class Item {

    Produto produtos;
    private double quantidade;

    public Item(Produto produtos, double quantidade){
        this.quantidade = quantidade;
        this.produtos = produtos;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    

    
    
}
