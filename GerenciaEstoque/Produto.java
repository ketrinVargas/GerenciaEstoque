package GerenciaEstoque;

import java.util.ArrayList;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double quantidade;
    private double preco;
    private ArrayList<Produto> produtos;

    public Produto(int codigo, String nome, String descricao, double quantidade, double preco, ArrayList<Produto> produtos) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.produtos = produtos;
    }

    public Produto(int codigo, String nome, double preco){
        this.codigo = 1234;
        this.nome = nome;
        this.preco = 1.99;
    }

    public String toString() {
        return "Código: " + codigo + "Nome: " + nome + "Descrição: " + descricao + "Quantidade: " + quantidade
                + "Preço: " + preco;
    }

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}