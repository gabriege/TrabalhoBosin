
package br.unipar.livrariapoo.model;

public class Livro3 {
    
    private String livro_03;
    public String autor_03;
    private String editora_03;
    private String genero_03;
    private String lancamento_03;
    private String numPagina_03;
    private int estoque_03;
    private double preco_03;
    
    public void Status3(){
 
        System.out.println("Seu 1° Livro é " + this.livro_03);
        System.out.println(" O autor " + this.autor_03);
        System.out.println(" A editora " + this.editora_03);
        System.out.println(" O Gênero " + this.genero_03);
        System.out.println("Ano de lançamento " + this.lancamento_03);
        System.out.println("O livro tem " + this.numPagina_03);
        System.out.println("Em estoque " + this.estoque_03);
        System.out.println("Esse livro custa R$" + this.preco_03);
    }

    public String getLivro_03() {
        return livro_03;
    }

    public void setLivro_03(String livro_03) {
        this.livro_03 = livro_03;
    }

    public String getAutor_03() {
        return autor_03;
    }

    public void setAutor_03(String autor_03) {
        this.autor_03 = autor_03;
    }

    public String getEditora_03() {
        return editora_03;
    }

    public void setEditora_03(String editora_03) {
        this.editora_03 = editora_03;
    }

    public String getGenero_03() {
        return genero_03;
    }

    public void setGenero_03(String genero_03) {
        this.genero_03 = genero_03;
    }

    public String getLancamento_03() {
        return lancamento_03;
    }

    public void setLancamento_03(String lancamento_03) {
        this.lancamento_03 = lancamento_03;
    }

    public String getNumPagina_03() {
        return numPagina_03;
    }

    public void setNumPagina_03(String numPagina_03) {
        this.numPagina_03 = numPagina_03;
    }

    public int getEstoque_03() {
        return estoque_03;
    }

    public void setEstoque_03(int estoque_03) {
        this.estoque_03 = estoque_03;
    } 

    public double getPreco_03() {
        return preco_03;
    }

    public void setPreco_03(double preco_03) {
        this.preco_03 = preco_03;
    }

    @Override
    public String toString() {
        return "livros3{" + "livro_03=" + livro_03 + ", autor_03=" + autor_03 + ", editora_03=" + editora_03 + ", genero_03=" + genero_03 + ", lancamento_03=" + lancamento_03 + ", numPagina_03=" + numPagina_03 + ", estoque_03=" + estoque_03 + ", preco_03=" + preco_03 + '}';
    }
    
    

   
    
    
    
}
