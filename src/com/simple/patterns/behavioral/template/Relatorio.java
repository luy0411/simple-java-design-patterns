package com.simple.patterns.behavioral.template;

import java.util.List;

/**
 * Created by lumi on 23/07/16.
 */
abstract class Relatorio {
    protected abstract void cabecalho();
    protected abstract void rodape();
    protected abstract void corpo(List<Conta> contas);

    public void imprime(List<Conta> contas) {
        cabecalho();
        corpo(contas);
        rodape();
    }
}
