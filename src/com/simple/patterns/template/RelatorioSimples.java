package com.simple.patterns.template;

import java.util.List;

/**
 * Created by lumi on 23/07/16.
 */
class RelatorioSimples extends Relatorio {
    protected void cabecalho() {
        System.out.println("Banco XYZ");
    }

    protected void rodape() {
        System.out.println("(11) 1234-5678");
    }

    protected void corpo(List<Conta> contas) {
        for(Conta conta : contas) {
            System.out.println( conta.getNome() + " - " + conta.getSaldo() );
        }
    }
}

