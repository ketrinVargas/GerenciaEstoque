package Base;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal{
    private int data;
    private int codigo;
    List <Item> itens;

    public NotaFiscal(int data, int codigo, List <Item> itens){
        this.codigo = codigo;
        this.data = data;
        this.itens = itens;

    }
    public String toString() {
        return "Código: " + codigo + "Data:  " + data + "Itens : " + itens;
    }

    public int getData() {
        return data;
    }
        public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setData(int data) {
        this.data = data;
    }
    public List getItens(){
        return itens;
    }
   

}
