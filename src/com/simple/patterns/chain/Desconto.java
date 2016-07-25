package com.simple.patterns.chain;

import com.simple.patterns.strategy.Orcamento;

import java.text.DecimalFormat;

/**
 * Created by lumi on 23/07/16.
 */
public interface Desconto {

    double calculaDesconto(Orcamento orcamento);
}
