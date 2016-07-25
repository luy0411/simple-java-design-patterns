package com.simple.patterns.template;

import com.simple.patterns.strategy.Imposto;
import com.simple.patterns.strategy.Orcamento;

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
