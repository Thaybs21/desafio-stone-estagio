package desafiostone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 
public class ListaCompras {
    String itens; //Recebe nome dos itens
    int quantItens; // Recebe quantidade de itens
    int valorItem;  //Recebe valor da unidade
    int subtotal; // total geral (todos os itens)
    String linhaEm;
    int tamListVal, total, restoTotal;

    public void tratarArquivos() throws FileNotFoundException,IOException{
        //Leitura da lista de Compras
        try(BufferedReader buffR = new BufferedReader(new FileReader("lista-de-ompras.txt"))) {
            String linhaItem; 
            //Percorrendo o arquivo
            while((linhaItem = buffR.readLine()) != null){
                String[] partes = linhaItem.split(";");
                itens = partes [0];//reservando itens
                this.setQuantItens(Integer.parseInt(partes[1]));//reservando quantidade do item
                this.setValorItem(Integer.parseInt(partes[2]));//reservando valor do item
                //Cálculo das quantidades com o valor unitário
                int totalItem =  this.getQuantItens()* this.getValorItem();
                //Cálculo da soma dos valores da lista              
                subtotal += totalItem;
            }
        }catch(FileNotFoundException e){//validação do arquivo
            System.out.println("Erro com o arquivo! Por favor, escolha um arquivo diferente.");
        } 
        //Criação da lista para receber dados do arquivo
        List<String> emailList = new ArrayList<>();
        try (BufferedReader buff = new BufferedReader(new FileReader("lista-de-email.txt"))) {  
            //Percorrendo arquivo e adicionando valores ao ArrayList
            while ((linhaEm = buff.readLine()) != null) {
                emailList.add(linhaEm);
            }
            //Validação de lista vazia
            if(emailList.isEmpty()){
                System.out.println("Não existem clientes cadastrados para esta compra!");
            }else{
            
                //Criação de paramêtros de validaççao
                String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
                Pattern pattern = Pattern.compile(regex);

                List<String> emailValid = new ArrayList<>();//ArrayList para e-mail válidos APENAS
                for(String email: emailList) {
                    Matcher matcher = pattern.matcher(email);//validação e-mail    
                    if(matcher.matches() == true){
                        emailValid.add(email); //adicionando e-mails válidos ao novo ArrayList  
                    }
                }
                tamListVal = emailValid.size();//Captura do tamanho da do ArrayList
                total = (subtotal/tamListVal)/100;//Divisão do valor da lista com a quantidade de e-mails
                restoTotal = (subtotal%tamListVal);//Captura o resto da divisão
                
                //Validação de Lista de compras vazia
                if(total <= 0){
                    System.out.println("Não existe valor a ser cobrado");                            
                }else{

                    for(String email: emailValid) {//Percorrendo lista enquanto houver dados
                        //Criação do Map 
                        Map<String, Integer> emailMap = new HashMap<>();
                        if (restoTotal > 0) {//Distribuição de resto 
                            emailMap.put(email, total+ 1 );
                            restoTotal--;
                        }else{
                            emailMap.put(email, total);
                        }
                        //Exibição dos dados com forEach utilizado em Java 8
                        emailMap.forEach((emailChave, totalValor) -> System.out.println("A pessoa: " + emailChave + " está devendo " + totalValor + " reais."));
                    }
                }    
            }    
        }catch(FileNotFoundException e){//validação do arquivo
            System.out.println("Erro com o arquivo! Por favor, escolha um arquivo diferente.");
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
