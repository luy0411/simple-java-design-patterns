package com.simple.patterns.behavioral.template;

import com.simple.patterns.behavioral.strategy.Imposto;
import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public abstract class Template implements Imposto{
    @Override
    public double calcula(Orcamento orcamento) {
        if (deveTerMaximo(orcamento))
            return calcularMaximo(orcamento);
        else
            return calcularMinimo(orcamento);
    }

    public abstract double calcularMinimo(Orcamento orcamento);
    public abstract double calcularMaximo(Orcamento orcamento);
    public abstract boolean deveTerMaximo(Orcamento orcamento);
}
