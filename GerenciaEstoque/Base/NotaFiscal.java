package GerenciaEstoque.Base; 

import java.util.ArrayList;

public class NotaFiscal{
    private int data;
    private int codigo;
    ArrayList <Item> itens;

    public NotaFiscal(int data, int codigo, ArrayList <Item> itens){
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

   

}
