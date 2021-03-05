package GerenciaEstoque.Interfaces;

import GerenciaEstoque.Base.NotaFiscal;
import GerenciaEstoque.Interfaces.INotasFiscais;
import java.util.ArrayList;

public class NotasFiscais implements INotasFiscais {

    ArrayList <NotaFiscal> notaFiscal;

    @Override
    public boolean addNotaFiscal(NotaFiscal nf) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean removeNotaFiscal(int codigo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getTotal(int codigo) {
        // TODO Auto-generated method stub
        return 0;
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
