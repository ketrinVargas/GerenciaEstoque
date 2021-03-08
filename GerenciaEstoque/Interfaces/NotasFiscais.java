package GerenciaEstoque.Interfaces;

import GerenciaEstoque.Base.Item;
import GerenciaEstoque.Base.NotaFiscal;
import java.util.ArrayList;

public class NotasFiscais implements INotasFiscais {

    ArrayList <NotaFiscal> notaFiscal;

    @Override
    public boolean addNotaFiscal(NotaFiscal nf) {
        for(NotaFiscal notaF: notaFiscal){
			if(notaF == nf){
				notaFiscal.add(notaF);
			}
		}
        return false;
    }

    @Override
    public boolean removeNotaFiscal(int codigo) {
        for(NotaFiscal notaF: notaFiscal){
			if(notaF.getCodigo() == codigo){
				notaFiscal.remove(notaF);
			}
		}
        return false;
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) {
        for(NotaFiscal notaF: notaFiscal){
			if(notaF.getCodigo() == codigo){
				return notaF;
			}
		}
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
