package GerenciaEstoque.Interfaces;

import GerenciaEstoque.Base.Item;
import GerenciaEstoque.Base.NotaFiscal;
import java.util.ArrayList;
import java.util.Scanner;

public class NotasFiscais implements INotasFiscais {

    ArrayList <NotaFiscal> notaFiscal;
    ArrayList<Item> itens;
    Scanner sc = new Scanner(System.in);
    int itn;

    public NotasFiscais(){
        notaFiscal = new ArrayList();
        itens = new ArrayList();
    }

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

    	/*Fazer */
    @Override
    public double getTotal(int codigo) {

        return 0;
    }

    @Override
    public boolean addItem(int codigo, Item item) {

        System.out.println("Insira o código do produto: ");
		codigo = sc.nextInt();

		for(NotaFiscal nFiscal: notaFiscal){
			if(nFiscal.getCodigo() == codigo){
				System.out.println(" Nota Fiscal encontrada!! " );
				System.out.println(toString());
				sc.nextLine();

				System.out.println(" Insira a quantidade do produto que deseja adicinar:  " );
				itn = sc.nextInt();
                if(itn >= 0){
					itens.add(itn, item);
					System.out.println(" Item Adicionado com sucesso " );
				}
		else{
            System.out.println(" Nota Fiscal não encontrada" );
            }
        }
    }
    return false;
}

    @Override
    public boolean removeItem(int codigo, Item item) {
        System.out.println("Insira o código do produto: ");
		codigo = sc.nextInt();

		for(NotaFiscal nFiscal: notaFiscal){
			if(nFiscal.getCodigo() == codigo){
				System.out.println(" Nota Fiscal encontrada!! " );
				System.out.println(toString());
				sc.nextLine();

				System.out.println(" Insira o item que deseja remover:  " );
				itn = sc.nextInt();
                if(itn >= 0){
					itens.remove(itn);
					System.out.println(" Item removido com sucesso " );
				}
		else{
            System.out.println(" Nota Fiscal não encontrada" );
            }
        }
    }
    return false;
    }

}
