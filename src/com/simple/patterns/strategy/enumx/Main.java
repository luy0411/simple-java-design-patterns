package com.simple.patterns.strategy.enumx;

import com.simple.patterns.strategy.Imposto;
import com.simple.patterns.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500.0);
        calcularImposto(ImpostoEnum.ICMS,orcamento);
        calcularImposto(ImpostoEnum.ISS,orcamento);
    }

    private static void calcularImposto(Imposto imposto,
                                        Orcamento orcamento) {
        System.out.println(imposto.calcula(orcamento));
    }
}
