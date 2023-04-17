
package br.unipar.livrariapoo.model;

public class Vendas {
    
    private int qtdLivros;
    private String desLivros;
    private double vlPreco;
    private int qtdEstoque;
    private Cliente cliente;
    
    public Vendas(){
    }
    
    public Vendas(int qtdLivros, Cliente cliente, String desLivros, double vlPreco,int qtdEstoque){
        
        this.desLivros = desLivros;
        this.qtdEstoque = qtdEstoque;
        this.qtdLivros = qtdLivros;
        this.vlPreco = vlPreco;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    public String getDesLivros() {
        return desLivros;
    }

    public void setDesLivros(String desLivros) {
        this.desLivros = desLivros;
    }

    public double getVlPreco() {
        return vlPreco;
    }

    public void setVlPreco(double vlPreco) {
        this.vlPreco = vlPreco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vendas{" + "qtdLivros=" + qtdLivros + ", desLivros=" + desLivros + ", vlPreco=" + vlPreco + ", qtdEstoque=" + qtdEstoque + ", cliente=" + cliente + '}';
    }
    

  
    
    
}
