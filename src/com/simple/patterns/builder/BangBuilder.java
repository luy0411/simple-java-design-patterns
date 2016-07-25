package com.simple.patterns.builder;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by lumi on 23/07/16.
 */
public class BangBuilder {

    public Bang getInstance(){
        Bang bang = new Bang();
        bang.setNome("Luis");
        bang.setDataCriacao(LocalDate.now());
        bang.setValidacao("xyz");
        return bang;
    }
}
