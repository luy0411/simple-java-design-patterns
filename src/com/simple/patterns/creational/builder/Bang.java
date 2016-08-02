package com.simple.patterns.creational.builder;

import java.time.LocalDate;

/**
 * Created by lumi on 23/07/16.
 */
public class Bang {

    private String nome;
    private String validacao;
    private Double valor;
    private LocalDate dataCriacao;
    private String relatorio;
    private String cnpj;

    public Bang(String nome, String validacao, Double valor, LocalDate dataCriacao, String relatorio, String cnpj) {
        this.nome = nome;
        this.validacao = validacao;
        this.valor = valor;
        this.dataCriacao = dataCriacao;
        this.relatorio = relatorio;
        this.cnpj = cnpj;
    }

    public Bang() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValidacao() {
        return validacao;
    }

    public void setValidacao(String validacao) {
        this.validacao = validacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Bang{" +
                "nome='" + nome + '\'' +
                ", validacao='" + validacao + '\'' +
                ", valor=" + valor +
                ", dataCriacao=" + dataCriacao +
                ", relatorio='" + relatorio + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
