
package br.unipar.livrariapoo.model;

public class Livro1 {
    
    public String livro_01;
    public String autor_01;
    private String editora_01;
    private String genero_01;
    private String lancamento_01;
    private String numPagina_01;
    private int estoque_01;
    private double preco_01;
    
    public void Status1(){
        
        System.out.println("Seu 1° Livro é " + this.livro_01);
        System.out.println(" O autor " + this.autor_01);
        System.out.println(" A editora " + this.editora_01);
        System.out.println(" O Gênero " + this.genero_01);
        System.out.println("Ano de lançamento " + this.lancamento_01);
        System.out.println("O livro tem " + this.numPagina_01);
        System.out.println("Em estoque " + this.estoque_01);
        System.out.println("Este livro custa R$" + this.preco_01);
        
    }



    public String getLivro_01() {
        return livro_01;
    }

    public void setLivro_01(String livro_01) {
        this.livro_01 = livro_01;
    }

    public String getAutor_01() {
        return autor_01;
    }

    public void setAutor_01(String autor_01) {
        this.autor_01 = autor_01;
    }

    public String getEditora_01() {
        return editora_01;
    }

    public void setEditora_01(String editora_01) {
        this.editora_01 = editora_01;
    }

    public String getGenero_01() {
        return genero_01;
    }

    public void setGenero_01(String genero_01) {
        this.genero_01 = genero_01;
    }

    public String getLancamento_01() {
        return lancamento_01;
    }

    public void setLancamento_01(String lancamento_01) {
        this.lancamento_01 = lancamento_01;
    }

    public String getNumPagina_01() {
        return numPagina_01;
    }

    public void setNumPagina_01(String numPagina_01) {
        this.numPagina_01 = numPagina_01;
    }

    public int getEstoque_01() {
        return estoque_01;
    }

    public void setEstoque_01(int estoque_01) {
        this.estoque_01 = estoque_01;
    }

    public double getPreco() {
        return preco_01;
    }

    public void setPreco(double Preco) {
        this.preco_01 = Preco;
    }

    @Override
    public String toString() {
        return "Livro1{" + "livro_01=" + livro_01 + ", autor_01=" + autor_01 + ", editora_01=" + editora_01 + ", genero_01=" + genero_01 + ", lancamento_01=" + lancamento_01 + ", numPagina_01=" + numPagina_01 + ", estoque_01=" + estoque_01 + ", Preco=" + preco_01 + '}';
    }
    
    

   

   

    

    
    
    
    
    
}

  
  
