package com.simple.patterns.behavioral.template;

import com.simple.patterns.behavioral.chain.Item;
import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class ICKK extends Template {
    @Override
    public double calcularMinimo(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    public double calcularMaximo(Orcamento orcamento) {
        return orcamento.getValor() * 0.09;
    }

    @Override
    public boolean deveTerMaximo(Orcamento orcamento) {
        return orcamento.getValor() > 500 && possuiItem(orcamento);
    }

    private boolean possuiItem(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100)
                return true;
        }
        return false;
    }
}
