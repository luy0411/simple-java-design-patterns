package com.simple.patterns.structural.decorator;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class ICMS extends Imposto {

    public ICMS() {
        super();
    }

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
    }

}
