package org.example;
import java.util.Scanner;

public class ContaBanco {
    //Atributos
    public int numeroDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos do sistema

    public void abrirConta(){

    }

    public void fecharConta(){


    }

    public void depositar(){

    }

    public void sacar(){

    }

    public void pagarMensalidade(){

    }
    //Método construtor
    public ContaBanco(){

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    //Métodos getters and setters

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
