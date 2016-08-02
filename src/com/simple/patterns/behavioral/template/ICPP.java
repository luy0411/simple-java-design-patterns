package com.simple.patterns.behavioral.template;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class ICPP extends Template {
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
        return orcamento.getValor() > 500;
    }

}
