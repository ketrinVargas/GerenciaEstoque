package GerenciaEstoque;

import java.util.ArrayList;

import Base.Produto;
import GerenciaEstoque.Interfaces.IProdutos;

public class Produtos implements IProdutos{
 
    private ArrayList <Produto> produtos;

    @Override
    public boolean addProduto(Produto p) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeProduto(int codigo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Produto getProduto(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean updateQuantidade(int codigo, double nova) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean updatePreco(int codigo, double novo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean addQuantidade(int codigo, double quantidade) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean subQuantidade(int codigo, double quantidade) {
        // TODO Auto-generated method stub
        return false;
    }

    
}
