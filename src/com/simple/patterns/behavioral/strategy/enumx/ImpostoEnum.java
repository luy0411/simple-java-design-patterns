package com.simple.patterns.behavioral.strategy.enumx;

import com.simple.patterns.behavioral.strategy.Imposto;
import com.simple.patterns.behavioral.strategy.Orcamento;

/**
 * Created by lumi on 23/07/16.
 */
public enum ImpostoEnum implements Imposto {
    ISS {
        @Override
        public double calcula(Orcamento orcamento) {
            return orcamento.getValor() * 0.05;
        }
    },
    ICMS {
        @Override
        public double calcula(Orcamento orcamento) {
            return orcamento.getValor() * 0.06;
        }
    },
    ANY {
        @Override
        public double calcula(Orcamento orcamento) {
            return 0;
        }
    };

}
