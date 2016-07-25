package com.simple.patterns.chain;

import com.simple.patterns.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class DescontoVenda implements Desconto {
    private Desconto proximoDesconto;

    public DescontoVenda(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    @Override
    public double calculaDesconto(Orcamento orcamento) {
        if (possuiItens(orcamento) )
            return orcamento.getValor() * 0.9;
        else
            return this.proximoDesconto.calculaDesconto(orcamento);
    }

    private boolean possuiItens(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals("Lapis") ||
                    item.getNome().equals("Caneta"))
                return true;
        }

        return false;
    }
}
