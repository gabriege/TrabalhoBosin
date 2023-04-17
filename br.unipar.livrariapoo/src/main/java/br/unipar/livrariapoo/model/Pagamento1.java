/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.livrariapoo.model;

public class Pagamento1 {
    private int valor;
    private int numerocartao;
    private String nometitular;
    private String datavalidade;
    private int codigoseguranca;
    
  

    public Pagamento1(){
        System.out.println("Pagamento em Cartão de crédito ");
        System.out.println("valor do pagamento 98 reais ");
        System.out.println("numero do cartão 546-54658 VISA ");
        System.out.println("nome do titular James Bh ");
        System.out.println("validade do cartão 05/25 ");
        System.out.println("codigo de segurança do cartão 510 ");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(int numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public String getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(String datavalidade) {
        this.datavalidade = datavalidade;
    }

    public int getCodigoseguranca() {
        return codigoseguranca;
    }

    public void setCodigoseguranca(int codigoseguranca) {
        this.codigoseguranca = codigoseguranca;
    }

    @Override
    public String toString() {
        return "Pagamento1{" + "valor=" + valor + ", numerocartao=" + numerocartao + ", nometitular=" + nometitular + ", datavalidade=" + datavalidade + ", codigoseguranca=" + codigoseguranca + '}';
    }

   
    }


 

   
        
    

