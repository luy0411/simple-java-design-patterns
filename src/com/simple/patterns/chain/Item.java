package com.simple.patterns.chain;

/**
 * Created by lumi on 23/07/16.
 */
public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
