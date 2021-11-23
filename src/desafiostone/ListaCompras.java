package desafiostone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 
public class ListaCompras {
    
    String itens; //Recebe nome dos itens
    int quantItens; // Recebe quantidade de itens
    int valorItem;  //Recebe valor da unidade
   
    void tratarArquivos() throws FileNotFoundException,IOException{
         //Leitura da lista de Compras
        try(BufferedReader buffR = new BufferedReader(new FileReader("lista-de-compras.txt"))) {
            int subtotal = 0; // total geral (todos os itens)
            String linhaIt; 
            while((linhaIt = buffR.readLine()) != null){
                String[] partes = linhaIt.split(";");
                itens = partes [0];
                this.setQuantItens(Integer.parseInt(partes[1]));
                this.setValorItem(Integer.parseInt(partes[2]));
                //Cálculo das quantidades com o valor unitário
                int totalItem =  this.getQuantItens()* this.getValorItem();
                //Cálculo da soma dos valores da lista              
                subtotal += totalItem;//realiza a soma de todos os itens com as quantidades calculadas
            }
            List<String> email = new ArrayList<>();
            try (BufferedReader buff = new BufferedReader(new FileReader("lista-de-email.txt"))) {
                String linhaEm;
                while ((linhaEm = buff.readLine()) != null) {
                    email.add(linhaEm);
                }
                for(String nome: email) {
                    //Tamanho da lista de e-mails
                    int tamLista = email.size(); 
                    //Divisão do valor da lista com a quantidade de e-mails
                    double total = subtotal/tamLista;

                    System.out.println("O cliente de e-mail: " + nome + " deverá pagar R$" + total/100);  
                }
                }catch(IOException e){
                System.out.println("Erro com o arquivo! Por favor, escolha um arquivo diferente.");
                }           
        } 
    } 
    
    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public int getQuantItens() {
        return quantItens;
    }

    public void setQuantItens(int quantItens) {
        this.quantItens = quantItens;
    }

    public int getValorItem() {
        return valorItem;
    }

    public void setValorItem(int valorItem) {
        this.valorItem = valorItem;
    }
    
}