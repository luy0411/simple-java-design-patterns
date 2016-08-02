package com.simple.patterns.behavioral.chain;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class SemDesconto implements Desconto {
    @Override
    public double calculaDesconto(Orcamento orcamento) {
        return 0;
    }
}
