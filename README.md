Apresentação da Aplicação: 
Método desenvolvido em Java que recebe uma lista de compras que possui item, quantidade do item e valor unitário, uma lista de e-mails e retorna o e-mail dela como chave e o valor que cada pessoa deverá pagar (valor total da lista divido pela quantidade de pessoas).

Como Começar:
Primeiramente, foi desenhado um fluxograma simples para auxiliar na modelagem do método(imagem no repositório). 
Em seguida, foi criada a classe ListaCompras(), onde receberá os parâmetros itens, quantItens e valorItem. 
Para teste, inclui dois arquivos .txt (lista-de-compras.txt. e lista-de-email.txt) onde estão dentro do package do projeto Desafiostone. 
Dentro dela temos os getters e setters dessas variáveis e o método tratarArquivos() onde nele recebemos primeiro a lista de compras em txt que está localizada na pasta do projeto e que contém "item;quantidade;valor-unitário" separados por ";" e os valores que estão registrados em centavos. Dentro de um while é separado cada dado da linha em uma posição de um array e depois é percorrido toda a lista até que a linha tenha dados nulos. Após a separação, é criada uma variavel que busca os valores de quantidade e valor unitário para descobrir o valor total do item e em seguida é somado o valor total da lista. 
No segundo bloco do método, é criado um ArrayList que receberá a lista de e-mails em txt e é criado um While para ler cada linha dela e um for para percorrer a lista e fazer a divisão do valor total da lista de compras com a quantidade de e-mails da lista de e-mails. 
Na ClasseMain() do método main() é criado o objeto da classe ListaCompras() e chamado o método tratarArquivos() para exibir a chave e valor devido de cada pessoa. 


Copyright (c) 2021 Thayna Bento da Silva

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "desafiostone"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

MIT License
