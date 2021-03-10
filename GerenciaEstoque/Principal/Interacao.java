import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Base.Produto;

public class Interacao {
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean escolhaValida;
        do {
            escolhaValida  = primeiraEscolha(0);
        } while (escolhaValida);
    }   

    public void mostar(String string) {
        System.out.println(string);
    }


    public String obtemDoUsuario(String texto) {
        mostar("Digite " + texto + " :  /n");
        String digitado = entrada.nextLine();
        return digitado;        
    }

   

    private void cadastrarProduto() {      
        String nome = obtemDoUsuario("o  nome do produto");
        String descricao = obtemDoUsuario("a descricao do produto");
        Double quantidade = Double.valueOf(obtemDoUsuario("a quantidade do produto"));
        Double preco = Double.valueOf(obtemDoUsuario("o preco do produto"));
        Produto produto = new Produto(nome, descricao, quantidade, preco);
        addProduto(produto);
    }

    private int consultarProduto() {
        int codigo = Integer.parseInt(obtemDoUsuario("o codigo do produto"));
        Produto produto = getProduto(codigo);
        mostar(produto);
        return codigo;
    }

    private void alterarProduto() { 
        int codigo = consultarProduto();
        double novoValor;
        int escolha = Integer.parseInt(obtemDoUsuario(
            "o numero referente ao oq vc quer alterar." +
            "1- Atualizar Quantidade" +
            "2- Atualizar preço" +
            "3- Aumentar quantidade" +
            "4- Diminuir quantidade"));
        switch (escolha) {
            case 1:
                novoValor = Double.parseDouble(obtemDoUsuario("o novo valor da Quantidade"));
                updateQuantidade(codigo , novoValor);
                break;
            case 2:
                novoValor = Double.parseDouble(obtemDoUsuario("o novo valor do Preço"));
                updatePreco(codigo, novoValor);
                break;
            case 3:
                novoValor = Double.parseDouble(obtemDoUsuario("o valor a aumentar"));
                addQuantidade(codigo, novoValor);
                break;
            case 4:
                novoValor = Double.parseDouble(obtemDoUsuario("o valor a diminuir."
                ));
                subQuantidade(codigo, novoValor);
                break;        
            default: 
                break;
        }
        
    }

    private void excluirProduto() {
        int codigo = Integer.parseInt(obtemDoUsuario("o codigo do produto"));
        removeProduto(codigo);
    }

    private void criarNota() {
        
    }

    private void consultarNota() {
        int codigo = Integer.parseInt(obtemDoUsuario("o codigo da nota"));
        NotaFiscal nota = getNotaFiscal(codigo);
        mostar(nota);
    }

    private void alterarNota() {
        
    }

    private void totalDoDia() {
        /*Date data = parse date*/ obtemDoUsuario(" a data. (DD/MM/AAAA)");

        
    }
    
}
