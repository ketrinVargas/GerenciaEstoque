package Interfaces;

import java.util.ArrayList;
import java.util.List;

import Base.Item;
import Base.NotaFiscal;
import Base.Produto;

public class NotasFiscais implements INotasFiscais {

    boolean result;
    private ArrayList <NotaFiscal> notaFiscal;

    @Override
    public boolean addNotaFiscal(NotaFiscal nf) {
        result = notaFiscal.add(nf);
        return result;
    }

    @Override
    public boolean removeNotaFiscal(int codigo) {
        NotaFiscal notaRemovida = notaFiscal.remove(codigo);
        if (notaRemovida == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) {
        NotaFiscal nota = notaFiscal.get(codigo);
        if (nota != null) {
            return nota;
        } else {
            return null;
        }
    }

    @Override
    public double getTotal(int codigo) {
        NotaFiscal nota = notaFiscal.get(codigo);
        List<Item> itens = nota.getItens();
        double total = 0;
        for(Item item : itens){
            double quantidade = item.getQuantidade();
            Produto produto = item.getProduto();
            double  preco = produto.getPreco();
            total = quantidade*preco;
        }
        return total;
    }

    @Override
    public boolean addItem(int codigo, Item item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeItem(int codigo, Item item) {
        // TODO Auto-generated method stub
        return false;
    }

    
    
}
