
package br.unipar.livrariapoo.model;

public class Livro2 {
   
    private String livro_02;
    public String autor_02;
    private String editora_02;
    private String genero_02;
    private String lancamento_02;
    private String numPagina_02;
    private int estoque_02;
    private double preco_02;
    
    
    public void Status2(){
        
        System.out.println("Seu 1° Livro é " + this.livro_02);
        System.out.println(" O autor " + this.autor_02);
        System.out.println(" A editora " + this.editora_02);
        System.out.println(" O Gênero " + this.genero_02);
        System.out.println("Ano de lançamento " + this.lancamento_02);
        System.out.println("O livro tem " + this.numPagina_02);
        System.out.println("Em estoque " + this.estoque_02);
        System.out.println("Esse livro custa R$" + this.preco_02);
        
    }

    public String getLivro_02() {
        return livro_02;
    }

    public void setLivro_02(String livro_02) {
        this.livro_02 = livro_02;
    }

    public String getAutor_02() {
        return autor_02;
    }

    public void setAutor_02(String autor_02) {
        this.autor_02 = autor_02;
    }

    public String getEditora_02() {
        return editora_02;
    }

    public void setEditora_02(String editora_02) {
        this.editora_02 = editora_02;
    }

    public String getGenero_02() {
        return genero_02;
    }

    public void setGenero_02(String genero_02) {
        this.genero_02 = genero_02;
    }

    public String getLancamento_02() {
        return lancamento_02;
    }

    public void setLancamento_02(String lancamento_02) {
        this.lancamento_02 = lancamento_02;
    }

    public String getNumPagina_02() {
        return numPagina_02;
    }

    public void setNumPagina_02(String numPagina_02) {
        this.numPagina_02 = numPagina_02;
    }

    public int getEstoque_02() {
        return estoque_02;
    }

    public void setEstoque_02(int estoque_02) {
        this.estoque_02 = estoque_02;
    }

    public double getPreco_02() {
        return preco_02;
    }

    public void setPreco_02(double preco_02) {
        this.preco_02 = preco_02;
    }

    @Override
    public String toString() {
        return "Livro2{" + "livro_02=" + livro_02 + ", autor_02=" + autor_02 + ", editora_02=" + editora_02 + ", genero_02=" + genero_02 + ", lancamento_02=" + lancamento_02 + ", numPagina_02=" + numPagina_02 + ", estoque_02=" + estoque_02 + ", preco_02=" + preco_02 + '}';
    }

   
    
    
   
   

}
