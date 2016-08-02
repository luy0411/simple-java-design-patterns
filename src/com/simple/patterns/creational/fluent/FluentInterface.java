package com.simple.patterns.creational.fluent;

import java.time.LocalDate;

/**
 * Created by lumi on 23/07/16.
 */
public class FluentInterface {

    private String string;
    private LocalDate date;
    private Double value;

    public FluentInterface getFluent(){
        return this;
    }

    public FluentInterface withString(final String string){
        this.string = string;
        return this;
    }

    public FluentInterface withDate(final LocalDate date){
        this.date = date;
        return this;
    }

    public FluentInterface withValue(final Double value){
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "FluentInterface{" +
                "string='" + string + '\'' +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
