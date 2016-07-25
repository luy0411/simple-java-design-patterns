package com.simple.patterns.chain;

import com.simple.patterns.strategy.Orcamento;
import sun.security.krb5.internal.crypto.Des;

/**
 * Created by lumi on 23/07/16.
 */
public class SemDesconto implements Desconto {
    @Override
    public double calculaDesconto(Orcamento orcamento) {
        return 0;
    }
}
