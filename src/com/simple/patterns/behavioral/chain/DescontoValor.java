package com.simple.patterns.behavioral.chain;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class DescontoValor implements Desconto {
    private Desconto proximoDesconto;

    public DescontoValor(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    @Override
    public double calculaDesconto(Orcamento orcamento) {
        if (orcamento.getValor() > 500.0)
            return orcamento.getValor() * 0.05;
        else
            return this.proximoDesconto.calculaDesconto(orcamento);
    }

}
