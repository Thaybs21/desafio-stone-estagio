Apresentação da Aplicação: Método desenvolvido em Java onde recebe uma lista de compras que possui item, quantidade do item e valor unitário e uma lista de e-mails. É retornado o e-mail do cliente como chave e o valor que cada pessoa deverá pagar (valor total da lista divido pela quantidade de pessoas).

Dentro do package desafiostone foi criada a classe ListaCompras(), onde receberá os parâmetros itens, quantItens e valorItem. Dentro dela temos os getters e setters dessas variáveis e o método tratarArquivos() onde serão tratados os dados recebidos através de dois arquivos .txt para que sejam feitas as entradas dos dados, tanto a lista de compras(contém "item;quantidade;valor-unitário(em centavos)" separados por ";" ) como a lista de e-mails. 
Ao receber a lista de compras, dentro de um while é separado cada dado da linha em uma posição de um array e depois é percorrido toda a lista até que a linha tenha dados nulos. Após a separação, é criada uma variável que busca a quantidade e valor unitário para descobrir o valor total do item e somar o valor total da lista. 
Na segunda parte do método, é criado um ArrayList que receberá a lista de e-mails em txt e é criado um while para ler cada linha dela. Após receber os dados, é criado um parâmetro de validação dos e-mails inseridos, para filtrar os e-mails inválidos. 
Para realizar a separação dos e-mails, é  adicionado à um novo ArrayList chamado emailValid apenas os e-mails que foram validados, dentro de um if  que percorreu a lista via for.
Para atribuir os valores à cada cliente, é capturado o tamanho do ArrayList emailValid, onde é dividido o valor total com a quantidade de e-mails da lista. 
Dentro de um novo for, é criado um Map para a exibição da chave (e-mail) e valor (valor devido da compra para cada cliente) e é tratado o resto para que não sobre nenhum valor na divisão feita. 
Na ClasseMain() do método main() é criado o objeto da classe ListaCompras() e chamado o método tratarArquivos() para exibir a chave e valor devido de cada pessoa.

O código foi desenvolvido na versão Java 8, qualquer versão anterior usada pode acarretar ao mal funcionamento dele. 
Para teste e validação é criado um if para verificar se o arquivo da lista de e-mails está vazio e um if para descobrir se existem valores a serem cobrados na lista de compras, caso deem negativo, o código continua a ler o programa. Os blocos de código do método que tratam os arquivos estão protegidos por try-catch com FileNotFoundException onde é exibida uma mensagem caso haja problemas com o arquivo indicado.
Foi realizado o teste com listas vazias (tanto de compras como de e-mails), com valores inválidos na lista de e-mails e  com listas de tamanhos e valores diversos. Todos funcionaram conforme esperado e sem erros. 

Copyright (c) 2021 Thayna Bento da Silva

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "desafiostone"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

MIT License 


