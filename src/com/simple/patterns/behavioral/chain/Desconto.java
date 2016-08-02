package com.simple.patterns.behavioral.chain;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public interface Desconto {

    double calculaDesconto(Orcamento orcamento);
}
