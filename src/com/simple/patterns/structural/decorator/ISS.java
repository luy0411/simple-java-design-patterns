package com.simple.patterns.structural.decorator;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class ISS extends Imposto {

    public ISS() {
        super();
    }

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }
}
