

package br.unipar.br.unipar.livrariapoo;


import br.unipar.livrariapoo.model.Cliente;
import br.unipar.livrariapoo.model.Livro1;
import br.unipar.livrariapoo.model.Livro2;
import br.unipar.livrariapoo.model.Livro3;
import br.unipar.livrariapoo.model.Pagamento1;
import br.unipar.livrariapoo.model.Pagamento2;
import br.unipar.livrariapoo.model.Vendas;




public class Main {

    public static void main(String[] args) {
        
        
        Livro1 descricao = new Livro1();
        
        System.out.println("***********************************************");
        descricao.setLivro_01("Herry Potter: Pedra Filosofal");
        descricao.setAutor_01("J. K. Rowling");
        descricao.setEditora_01("Bloomsbury");
        descricao.setGenero_01("Fantasia e ficção");
        descricao.setLancamento_01("1°Publicação em 1997");
        descricao.setNumPagina_01("638 páginas");
        descricao.setEstoque_01(80);
        descricao.setPreco(98.00);
        descricao.Status1();
        
        Livro2 descricao2 = new Livro2();
        
        System.out.println("***********************************************");
        descricao2.setLivro_02("O senhor dos anéis");
        descricao2.setAutor_02("J.R.R. Tolkien");
        descricao2.setEditora_02("Allen & Unwin");
        descricao2.setGenero_02("Fantasia e ficção");
        descricao2.setLancamento_02("1°Publicação em 1980");
        descricao2.setNumPagina_02("1568 página");
        descricao2.setEstoque_02(100);
        descricao2.setPreco_02(250.00);
        descricao2.Status2();
        
        Livro3 descricao3 = new Livro3();
        
        System.out.println("***********************************************");
        descricao3.setLivro_03("O Pequeno Príncipe");
        descricao3.setAutor_03("Antoine de Saint-Exupéry");
        descricao3.setEditora_03("HarperCollins");
        descricao3.setGenero_03("Fábula e ficção");
        descricao3.setLancamento_03("1°Publicação em 1943");
        descricao3.setNumPagina_03("93 páginas");
        descricao3.setEstoque_03(70);
        descricao3.setPreco_03(85.00);
        descricao3.Status3();
        System.out.println("***********************************************");
        
        Cliente cliente = new Cliente("06789546200", 
                "Matheus", "Rua Thomas Gonzaga, 1502 "
                        + "- Pioneira - Toledo- PR - Brasil");
        
        Vendas vendas = new Vendas();
        
        vendas.setCliente(cliente);
        vendas.setQtdLivros(100);
        vendas.setQtdEstoque(100);
        vendas.setVlPreco(98.00);
        
        
        Pagamento1 cartaocredito = new Pagamento1();
        
        System.out.println("***********************************************");
        cartaocredito.setValor(98);
        cartaocredito.setNumerocartao(90964869);
        cartaocredito.setCodigoseguranca(510);
        cartaocredito.setDatavalidade("dez");
        cartaocredito.setNometitular("james");
        
        
        
        
        
        
        Pagamento2 pagamento2 = new Pagamento2();
        
        pagamento2.setChavePix("dennis@gmail.com");
        pagamento2.setDescricao("tipo de conta banco do brasil");
        pagamento2.setValor(98);
        
        
        
        
        
        
        
        
       
       
        
       
        
        
        
        
        
        
        
        
        
         
        
        
        
        
        
        
     
        
        
        
        
        
     
       
       
        
        
        
        
       
      

    }

    
   
}
