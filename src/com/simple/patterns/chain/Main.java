package com.simple.patterns.chain;

import com.simple.patterns.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Desconto semDesconto = new SemDesconto();
        Desconto descontoVenda = new DescontoVenda(semDesconto);
        Desconto descontoValor = new DescontoValor(descontoVenda);
        Desconto descontoItens = new DescontoItens(descontoValor);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("Papel",100.0));
        orcamento.adicionaItem(new Item("Caneta",500.0));

        double desconto = descontoItens.calculaDesconto(orcamento);

        System.out.println(desconto);
    }
}
