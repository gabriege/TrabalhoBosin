/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.livrariapoo.model;

/**
 *
 * @author diogo
 */
public class Pagamento2 {
    
   
    private String chavePix; 
    private String descricao;
    private double valor; 

    public Pagamento2() {
        System.out.println("Pagamento via Pix ");
        System.out.println("Chave pix  lukinha@gmail.com ");
        System.out.println("Banco do Brasil ");
        System.out.println("Valor da transação 150 reais ");
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento2{" + "chavePix=" + chavePix + ", descricao=" + descricao + ", valor=" + valor + '}';
    }
    
    
   
    }
    
   
    


    

