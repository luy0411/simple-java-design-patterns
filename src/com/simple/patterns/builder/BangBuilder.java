package com.simple.patterns.builder;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by lumi on 23/07/16.
 */
public class BangBuilder {

    public Bang getSimpleBang(final String nome){
        final Bang bang = new Bang();
        bang.setNome(nome);
        bang.setDataCriacao(LocalDate.now());
        return bang;
    }

    public Bang getComplexBang(final String nome,
                               final Double valor,
                               final String cnpj){
        final Bang bang = new Bang();
        validateCNPJ(cnpj);
        bang.setNome(nome);
        bang.setCnpj(cnpj);
        bang.setValor(calculate(valor));
        bang.setDataCriacao(LocalDate.now());
        return bang;
    }

    private void validateCNPJ(String cnpj) {
        if(cnpj.isEmpty())
            throw new RuntimeException("CNPJ inválido");
    }

    private Double calculate(final Double valor) {
        return valor * 0.1;
    }
}
