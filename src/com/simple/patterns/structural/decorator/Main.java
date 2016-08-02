package com.simple.patterns.structural.decorator;

import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {
    public static void main(String[] args) {
        Imposto impostoComplexo = new ISS(new ICMS());

        Orcamento orcamento = new Orcamento(500.0);

        double valor = impostoComplexo.calcula(orcamento);

        System.out.println(valor);
    }
}
