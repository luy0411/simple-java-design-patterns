package com.simple.patterns.strategy;

/**
 * Created by lumi on 23/07/16.
 */
public class ISS implements Imposto{

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
