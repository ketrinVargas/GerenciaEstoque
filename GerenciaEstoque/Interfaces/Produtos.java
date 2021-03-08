package GerenciaEstoque.Interfaces;

import GerenciaEstoque.Base.Produto;
import GerenciaEstoque.Interfaces.IProdutos;
import java.util.ArrayList;
import java.util.Scanner;

public class Produtos implements IProdutos{

    private ArrayList <Produto> produtos;

	public Produtos( ){
		produtos = new ArrayList();
	}

	@Override
	public boolean addProduto(Produto p) {
		for(Produto prod: produtos){
			if(prod == p){
				produtos.add(prod);
			}
		}
		return false;
	}

	@Override
	public boolean removeProduto(int codigo) {
		for(Produto prod: produtos){
			if(prod.getCodigo() == codigo){
					produtos.remove(prod);
			}
		}
		return false;
	}

	@Override
	public Produto getProduto(int codigo) {
		for(Produto prod: produtos){
			if(prod.getCodigo() == codigo){
					return prod;
			}
		}
		return null;
	}

	@Override
	public boolean updateQuantidade(int codigo, double nova) {
		// TODO Auto-generated method st
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

