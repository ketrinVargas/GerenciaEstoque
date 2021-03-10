package GerenciaEstoque.Interfaces;

import GerenciaEstoque.Base.Produto;
import GerenciaEstoque.Base.ProdutoKilo;
import GerenciaEstoque.Base.ProdutoUnidade;
import GerenciaEstoque.Interfaces.IProdutos;
import java.util.ArrayList;
import java.util.Scanner;

public class Produtos implements IProdutos{

    private ArrayList <Produto> produtos;
	Scanner sc = new Scanner(System.in);
	int opcao;

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

	/*Terminar */
	@Override
	public boolean updateQuantidade(int codigo, double nova) {
		int novo;
		System.out.println("Insira o código do produto para atualização: ");
		codigo = sc.nextInt();

		for(Produto prod: produtos){
			if(prod.getCodigo() == codigo){
				System.out.println(" Produto encontrado" );
				System.out.println(toString());
				sc.nextLine();

				do {
				System.out.println(" Deseja alterar a quantidade por:  ");
				System.out.println(" 1 - Unidade: " );
				System.out.println(" 2 - Quilo: " );
				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
					case 1:
					sc.nextLine();
                    System.out.println(" Digite a quantidade que deseja alterar:  ");
					novo = sc.nextInt();


					
                    break;
                case 2:
				sc.nextLine();
				System.out.println(" Digite a quantidade que deseja alterar:  ");
				nova = sc.nextDouble();

                    break;
				default:
                    System.out.println("Opção inválida!");
                    break;
				}
				
			}while (opcao != 0);

		}else{
			System.out.println("Código buscado não encontrado");
			}
		}
		return false;
}

	/*Terminar */
	@Override
	public boolean updatePreco(int codigo, double novo) {
		System.out.println("Insira o código do produto: ");
		codigo = sc.nextInt();

		for(Produto prod: produtos){
			if(prod.getCodigo() == codigo){
				System.out.println(" Produto encontrado!! " );
				System.out.println(toString());
				sc.nextLine();

				System.out.println(" Insira novo valor do produto:  " );
				novo= sc.nextDouble();

			}
		}
		return false;
	}

		/*Terminar */
	@Override
	public boolean addQuantidade(int codigo, double quantidade) {
		System.out.println("Insira o código do produto: ");
		codigo = sc.nextInt();

		for(Produto prod: produtos){
			if(prod.getCodigo() == codigo){
				System.out.println(" Produto encontrado!! " );
				System.out.println(toString());
				sc.nextLine();

				do {
				System.out.println(" Deseja adicionar a quantidade por:  ");
				System.out.println(" 1 - Unidade: " );
				System.out.println(" 2 - Quilo: " );
				opcao = sc.nextInt();
				sc.nextLine();

				switch (opcao) {
					case 1:
					System.out.println(" Degite a quantidade que deseja adicionar:  ");
					quantidade = sc.nextDouble();
					/*produtos.add(ProdutoUnidade(quantidade));*/
                    break;
                case 2:
				System.out.println(" Degite a quantidade que deseja adicionar:  ");
				quantidade = sc.nextDouble();
				/*produtos.add(ProdutoKilo(quantidade));*/
                    break;
				default:
                    System.out.println("Opção inválida!");
                    break;
				}
				
			}while (opcao != 0);

		}else{
			System.out.println("Código buscado não encontrado");
			}
		}
		return false;
}


	/*fazer */
	@Override
	public boolean subQuantidade(int codigo, double quantidade) {
		
		return false;
	}
}
