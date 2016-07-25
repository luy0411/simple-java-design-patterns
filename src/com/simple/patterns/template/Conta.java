package com.simple.patterns.template;

/**
 * Created by lumi on 23/07/16.
 */
public class Conta {

    private String nome;
    private String saldo;
    private String agencia;
    private String numero;

    public Conta(String nome, String saldo, String agencia, String numero) {
        this.nome = nome;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }
}
