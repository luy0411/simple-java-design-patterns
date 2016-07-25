package com.simple.patterns.strategy;

import com.simple.patterns.chain.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lumi on 23/07/16.
 */
public class Orcamento {

    private final double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        itens = new ArrayList<>();
    }

    public void adicionaItem(Item item){
        this.itens.add(item);
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }
}
