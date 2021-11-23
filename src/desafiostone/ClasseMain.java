package desafiostone;

import java.io.IOException;

public class ClasseMain {
   
    public static void main(String[] args) throws IOException {
            
        ListaCompras itemList = new ListaCompras(); //Criando objeto da classe ListaCompras
         
        //Chamada do método da classe ListaCompras()
        itemList.tratarArquivos();
    }
}
