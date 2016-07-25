package com.simple.patterns.strategy;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        Orcamento orcamento = new Orcamento(500.0);
        calcularImposto(icms,orcamento);
        calcularImposto(iss,orcamento);
    }

    private static void calcularImposto(Imposto imposto,
                                        Orcamento orcamento) {
        System.out.println(imposto.calcula(orcamento));
    }
}
