package com.simple.patterns.template;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lumi on 23/07/16.
 */
public class Main {

    public static void main(String[] args) {
        Relatorio completo = new RelatorioCompleto();
        Relatorio simples = new RelatorioSimples();

        List<Conta> contas = Arrays.asList(new Conta("a", "b", "c", "d"),
                                           new Conta("a", "b", "c", "d"));
        simples.imprime(contas);

        System.out.println("");
        System.out.println("");

        completo.imprime(contas);
    }
}
