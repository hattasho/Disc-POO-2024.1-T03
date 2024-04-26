# DISC-POO-2024.1-T03
Terceira parte do trabalho da disciplina de Programação Orientada a Objetos. Primeiro semestre de 2024 (Período 3) 

## Atividades referentes ao capítulo 6 e 8: Vetor e Sub-rotina.
### Activities related to chapter 4 and 5: Array and Subroutine.
- Lista 03: TODOS os Exercícios Resolvidos.
- List 3: ALL Solved Exercises.

## Equipe:
### Team:
- Ana Beatriz Carvalho de Menezes
- Isaac Ramos
- Saul Ramos
- Arthur Lima
- Cauã Rodrigues

## Professor Orientador: Roger Moura Sarmento.
### Teacher Advisor: Roger Moura Sarmento.

# Exercícios resolvidos do capítulo 6 do livro de Fundamentos da Programação de Computadores da matéria de POO de JAVA

## Enunciados das questões:
1. Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números primos e suas respectivas posições.

2. Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas. O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez). Depois, determine e mostre:
- um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final, deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e
- o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).

3. Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante
da intercalação deles.  
Vetor 1  3 5 4 2 2 5 3 2 5 9  
         1 2 4 4 5 6 7 8 9 10  
Vetor 2  7 15 20 0 18 4 55 23 8 6  
         1 2 4 4 5 6 7 8 9 10  

Vetor resultante da intercalação  

3 7 5 15 4 20 2 0 2 18 5 4 3 55 2 23 5 8 9 6  
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

4. Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números negativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.

5. Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre
os seguintes vetores resultantes:  
- A união de X com Y (todos os elementos de X e de Y sem repetições).  
x 3 8 4 2 1 6 8 7 11 9  
  1 2 3 4 5 6 7 8 9 10  
y 2 1 5 12 3 0 1 4 5 6  
  1 2 3 4 5 6 7 8 9 10  
União 3 8 4 2 1 6 7 11 9 5 12 0  
      1 2 3 4 5 6 7 8 9 10 11 12
  
- A diferença entre X e Y (todos os elementos de X que não existam em Y, sem repetições).  
x 3 8 4 2 1 6 8 7 11 9  
  1 2 3 4 5 6 7 8 9 10  
y 2 1 5 12 3 0 1 4 5 6  
  1 2 3 4 5 6 7 8 9 10  
Diferença 8 7 11 9  
          1 2 3 4  

- A soma entre X e Y (soma de cada elemento de X com o elemento de mesma posição em Y).  
x 3 8 4 2 1 6 8 7 11 9  
  1 2 3 4 5 6 7 8 9 10  
y 2 1 5 12 3 0 1 4 5 6  
  1 2 3 4 5 6 7 8 9 10  
Soma 5 9 9 14 4 6 9 11 16 15  
      1 2 3 4 5 6 7 8 9 10  

- O produto entre X e Y
(multiplicação de cada elemento de X com o elemento de mesma posição em Y).  
x 3 8 4 2 1 6 8 7 11 9  
1 2 3 4 5 6 7 8 9 10  
y 2 1 5 12 3 0 1 4 5 6  
  1 2 3 4 5 6 7 8 9 10  
Produto 6 8 20 24 3 0 8 28 55 54  
          1 2 3 4 5 6 7 8 9 10
  
- A intersecção entre X e Y
(apenas os elementos que aparecem nos dois vetores, sem repetições).  
x 3 8 4 2 1 6 8 7 11 9  
  1 2 3 4 5 6 7 8 9 10  
y 2 1 5 12 3 0 1 4 5 6  
  1 2 3 4 5 6 7 8 9 10  
Intersecção 3 4 2 1 6  
            1 2 3 4 5  

6. Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resultante de uma ordenação decrescente.  
x 3 5 4 2 1 6 8 7 11 9  
  1 2 3 4 5 6 7 8 9 10  
Ordenado 11 9 8 7 6 5 4 3 2 1  
         1 2 3 4 5 6 7 8 9 10  

7. Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene de forma crescente.

8. Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições, composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.  
x 6 8 1 10 3  
  1 2 3 4 5  
X 1 3 6 8 10  
ordenado 1 2 3 4 5  
y 20 0 7 2 5  
     1 2 3 4 5  
Y 0 2 5 7 20  
Ordenado 1 2 3 4 5  
Resultado 0 1 2 3 5 6 7 8 10 20  
          1 2 3 4 5 6 7 8 9 10  

9. Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um menu com as seguintes opções:
- consultar;
-  efetuar reserva; e
- sair.

 Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes opções:
- por número do voo;
- por origem; e
- por destino.

 Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pessoa deseja viajar. O programa deverá dar as seguintes respostas:

- reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
- voo lotado — caso não exista lugar disponível nesse voo;
- voo inexistente — caso o código do voo não exista.
A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação de consulta ou reserva, o programa volta ao menu principal.

10. Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros dados são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.

 Calcule e mostre:
- o número e a nota de cada aluno; e
- a porcentagem de aprovação, sabendo-se que a nota mínima é 6.

11. Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor. Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – fevereiro...). Desconsidere empates.

12. Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca, Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um deles faz com um litro de combustível. Calcule e mostre:
- o modelo de carro mais econômico; e
- quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de 1.000 km.

13. Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números superiores a cinquenta e suas respectivas posições. O programa deverá mostrar mensagem se não existir nenhum número nessa condição.

14. Faça um programa que preencha três vetores com cinco posições cada. O primeiro vetor receberá os nomes de cinco funcionários; o segundo e o terceiro vetor receberão, respectivamente, o salário e o tempo de serviço de cada um. Mostre um primeiro relatório apenas com os nomes dos funcionários que não terão aumento; mostre um segundo relatório apenas com os nomes e os novos salários dosfuncionários que terão aumento. Sabe-se que os funcionários que terão direito ao aumento são aqueles que possuem tempo de serviço superior a cinco anos ou salário inferior a R$ 800,00. Sabe-se, ainda, que, se o funcionário satisfizer às duas condições anteriores, tempo de serviço e salário, o aumento será de 35%; para o funcionário que satisfazer apenas à condição tempo de serviço, o aumento será de 25%; para aquele que satisfazer apenas à condição salário, o aumento será de 15%.

15. Faça um programa que preencha um primeiro vetor com dez números inteiros, e um segundo vetor com cinco números inteiros. O programa deverá mostrar uma lista dos números do primeiro vetor com seus respectivos divisores armazenados no segundo vetor, bem como suas posições.  
Num 5 12 4 7 10 3 2 6 23 16  
     1 2 3 4 5 6 7 8 9 10  
Divis 3 11 5 8 2  
      1 2 3 4 5  
Número 5  
Divisível por 5 na posição 3  
Número 12  
Divisível por 3 na posição 1  
Divisível por 2 na posição 5  
Número 4  
Divisível por 2 na posição 5  
Número 7  
Não possui divisores no segundo vetor  
Número 10  
Divisível por 5 na posição 3  
Divisível por 2 na posição 5  
Para saber se um número é divisível por outro, deve-se testar o resto. Exemplo: RESTO(5/5) = 0

16. Faça um programa que preencha um vetor com dez números inteiros e um segundo vetor com cinco números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor resultante será composto pelos números pares, gerados pelo elemento do primeiro vetor somado a todos os elementos do segundo vetor; o segundo será composto pelos números ímpares gerados pelo elemento do primeiro vetor somado a todos os elementos do segundo vetor.  
Primeiro vetor 4 7 5 8 12 15 9 6 10 11  
                1 2 3 4 5 6 7 8 9 10  
Segundo vetor 3 4 5 8 2  
              1 2 3 4 5  
Vetor resultante 1 26 30 22 ...  
                   1 2 3 ...  
Vetor resultante 2 29 27 37 ...  
                    1 2 3 ...  

17. Faça um programa que receba seis números inteiros e mostre:
- os números pares digitados;
- a soma dos números pares digitados;
- os números ímpares digitados; e 
- a quantidade de números ímpares digitados.  
Vetor 2 4 5 6 3 7  
      1 2 3 4 5 6  
Relatório  
Os números pares são:  
número 2 na posição 1  
número 4 na posição 2  
número 6 na posição 4  
Soma dos pares = 12  
Os números ímpares são:  
número 5 na posição 3  
número 3 na posição 5  
número 7 na posição 6  
Quantidade de ímpares = 3  

18. Faça um programa que receba o número sorteado por um dado em vinte jogadas. Mostre os números sorteados e a frequência com que apareceram.  
Vetor 1 – Antes da troca  
A G Y W 5 V S 8 6 J G A W 2 M C H Q 6 L  
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  
Vetor 2 – Antes da troca  
S D 4 5 H G R U 8 9 K S A 1 2 V 4 D 5 M  
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  
Vetor 1 – Depois da troca  
M 5 D 4 V 2 1 A S K 9 8 U R G H 5 4 D S  
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  
Vetor 2 – Depois da troca  
L 6 Q H C M 2 W A G J 6 8 S V 5 W Y G A  
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  

19. Faça um programa que preencha dois vetores, A e B, com vinte caracteres cada. A seguir, troque o 1°
elemento de A com o 20° de B, o 2° de A com o 19° de B, e assim por diante, até trocar o 20° de A com o 1° de B. Mostre os vetores antes e depois da troca.

20. Faça um programa que leia um vetor com cinco posições para números reais e, depois, um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.

21. Faça um programa que leia um conjunto de quinze valores e armazene-os em um vetor. A seguir, separe-os em dois outros vetores (P e I) com cinco posições cada. O vetor P armazena números pares e o vetor I, números ímpares. Como o tamanho dos vetores pode não ser suficiente para armazenar todos os números, deve-se sempre verificar se já estão cheios. Caso P ou I estejam cheios, deve-se mostrá-los e recomeçar o preenchimento da primeira posição. Terminado o processamento, mostre o conteúdo restante dentro dos vetores P e I.

22. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na tela:
    1. Efetuar depósito
    2. Efetuar saque
    3. Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes
    4. Finalizar o programa
- para efetuar depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, atualizar seu saldo;
- para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver cadastrada, deverá aparecer a mensagem Conta não encontrada e voltar ao menu. Se a conta existir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo que a conta não possa ficar com o saldo negativo.) Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso contrário, mostrar a mensagem Saldo insuficiente e voltar ao menu;
- para consultar o ativo bancário, deve-se somar o saldo de todas as contas do banco. Depois demostrar esse valor, voltar ao menu;
- o programa só termina quando for digitada a opção 4 — Finalizar o programa.

23. Uma empresa possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um programa que utilize dois vetores para controlar as poltronas ocupadas no corredor e na janela. Considere que 0 representa poltrona desocupada e 1, poltrona ocupada.  
Janela 0 1 0 0 . . . 1 0 0  
       1 2 3 4 . . . 22 23 24  
Corredor 0 0 0 1 . . . 1 0 0  
         1 2 3 4 . . . 22 23 24  
Inicialmente, todas as poltronas estarão livres. Depois disso, o programa deverá apresentar as seguintes opções:
- vender passagem;
- mostrar mapa de ocupação do ônibus;
- encerrar.
Quando a opção escolhida for Vender Passagem, deverá ser perguntado se o usuário deseja janela ou corredor e o número da poltrona. O programa deverá, então, dar uma das seguintes mensagens:
- Venda efetivada — se a poltrona solicitada estiver livre, marcando-a como ocupada.
- Poltrona ocupada — se a poltrona solicitada não estiver disponível para venda.
- Ônibus lotado — quando todas as poltronas já estiverem ocupadas.
Quando a opção escolhida for Mostrar Mapa de Ocupação do Ônibus, deverá ser mostrada uma listagem conforme a seguir:  
JANELA CORREDOR  
1- Ocupada 1- Ocupada  
2- Ocupada 2- Livre  
3- Livre 3- Livre  
4- Livre 4- Ocupada  
5- Ocupada 5- Livre  
...  
Quando for escolhida a opção Encerrar, a execução do programa deverá ser finalizada.

24. Faça um programa que leia um vetor A de dez posições contendo números inteiros. Determine e mostre, a seguir, quais elementos de A estão repetidos e quantas vezes cada um se repete.  
Vetor A 5 4 3 18 5 3 4 18 4 18  
         1 2 3 4 5 6 7 8 9 10  

25. Faça um programa que gere os dez primeiros números primos acima de 100 e armazene-os em um vetor. Escreva no final o vetor resultante.

# Exercícios resolvidos do capítulo 8 do livro de Fundamentos da Programação de Computadores da matéria de POO de JAVA

## Enunciados das questões:
1. Faça um programa contendo uma sub-rotina que retorne 1 se o número digitado for positivo ou 0 se for negativo.

2. Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro e retorne a soma dos N números inteiros existentes entre eles.

3. Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1. A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar o resultado para ser impresso.

4. Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina deverá convertê-lo para horas, minutos e segundos. Todas as variáveis devem ser passadas como parâmetro, não havendo variáveis globais.

5. Crie um programa que receba os valores antigo e atual de um produto. Chame uma sub-rotina que determine o percentual de acréscimo entre esses valores. O resultado deverá ser mostrado no programa principal.

6. Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9 e mostre a seguinte tabela de multiplicação (no exemplo, n = 9):  
1  
2 4  
3 6 9  
4 8 12 16  
5 10 15 20 25  
6 12 18 24 30 36  
7 14 21 28 35 42 49  
8 16 24 32 40 48 56 64  
9 18 27 36 45 54 63 72 81

7. Elabore um programa contendo uma sub-rotina que receba as três notas de um aluno como parâmetros e uma letra. Se a letra for A, a sub-rotina deverá calcular a média aritmética das notas do aluno; se for P, deverá calcular a média ponderada, com pesos 5, 3 e 2. A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.

8. Crie uma sub-rotina que receba como parâmetro a hora de início e a hora de término de um jogo, ambas subdivididas em dois valores distintos: horas e minutos. A sub-rotina deverá retornar a duração expressa em minutos, considerando que o tempo máximo de duração de um jogo é de 24 horas e que ele pode começar em um dia e terminar no outro.

9. Faça uma sub-rotina que leia cinco valores inteiros, determine e mostre o maior e o menor deles.

10. Crie uma sub-rotina que receba como parâmetro um valor inteiro e positivo N e retorne o valor de S,
obtido pelo seguinte cálculo:  
S = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!

11. Foi realizada uma pesquisa sobre algumas características físicas de cinco habitantes de uma região. Foram coletados os seguintes dados de cada habitante: sexo, cor dos olhos (A — azuis; ou C — castanhos), cor dos cabelos (L — louros; P — pretos; ou C — castanhos) e idade. Faça um programa que apresente as sub-rotinas a seguir:
- Que leia esses dados, armazenando-os em vetores.
- Que determine e devolva ao programa principal a média de idade das pessoas com olhos castanhos e cabelos pretos.
- Que determine e devolva ao programa principal a maior idade entre os habitantes.
- Que determine e devolva ao programa principal a quantidade de indivíduos do sexo feminino com idade entre 18 e 35 anos (inclusive) e que tenham olhos azuis e cabelos louros.

12. Elabore uma sub-rotina que retorne um vetor com os três primeiros números perfeitos. Sabe-se que um número é perfeito quando é igual à soma de seus divisores (exceto ele mesmo). Exemplo: os divisores de 6 são 1, 2 e 3, e 1 + 2 + 3 = 6, logo 6 é perfeito.

13. Faça uma sub-rotina que receba um vetor A de dez elementos inteiros como parâmetro. Ao final dessa função, deverá ter sido gerado um vetor B contendo o fatorial de cada elemento de A. O vetor B deverá ser mostrado no programa principal.

14. Crie uma sub-rotina que receba como parâmetro dois vetores de dez elementos inteiros positivos e mostre o vetor união dos dois primeiros.

15. Faça uma sub-rotina que receba como parâmetro um vetor A com cinco números reais e retorne esses números ordenados de forma crescente.

16. Crie uma sub-rotina que receba dois vetores A e B de dez elementos inteiros como parâmetro. A sub-rotina deverá determinar e mostrar um vetor C que contenha os elementos de A e B em ordem decrescente. O vetor C deverá ser mostrado no programa principal.

17. Faça uma sub-rotina que receba como parâmetro uma matriz A(5,5) e retorne a soma de seus elementos.

18. Crie uma sub-rotina que receba como parâmetro uma matriz A(6,6) e retorne o menor elemento de sua diagonal secundária.

19. Elabore uma sub-rotina que receba como parâmetro uma matriz A(6,6) e multiplique cada linha pelo elemento da diagonal principal da linha. A sub-rotina deverá retornar a matriz alterada para ser mostrada no programa principal.

20. Crie uma sub-rotina que receba como parâmetro uma matriz A(12,12) e retorne a média aritmética dos elementos abaixo da diagonal principal.

21. Escreva um algoritmo que leia um número não determinado de pares de valores x,y (x obrigatoriamente deve ser menor que y), todos inteiros e positivos, um par de cada vez. Para cada par, chame uma sub-rotina que determine a soma dos números primos entre x e y (inclusive). O algoritmo deverá mostrar os valores de x e de y, seguidos pelo somatório calculado. A leitura dos pares terminará quando os valores digitados para x e y forem iguais.

22. Crie um programa que carregue um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. O primeiro vetor resultante deverá conter os números positivos e o segundo, os números negativos. Cada vetor resultante terá no máximo oito posições, e nem todas serão obrigatoriamente utilizadas.

23. Crie um programa que carregue uma matriz 3X4 com números reais. Utilize uma função para copiar todos os valores da matriz para um vetor de 12 posições. Esse vetor deverá ser mostrado no programa principal.

24. Faça um programa contendo uma sub-rotina que receba dois valores numéricos e um símbolo. Esse símbolo representará a operação que se deseja efetuar com os números. Se o símbolo for +, deverá ser realizada uma adição, e, se for *, deverá ser efetuada uma multiplicação. O resultado deverá ser mostrado no programa principal.

25. Crie uma sub-rotina que receba como parâmetro um vetor A de 25 números inteiros e substitua todos os valores negativos de A por zero. O vetor resultante deverá ser mostrado no programa principal.
