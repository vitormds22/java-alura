# CURSO JAVA DO 0 COM A ALURA

* Nesse curso estou seguindo a trajetório do básico ao avançado com JAVA.
* O intuito é aprender desde a sintaxe básica, passar pela Programação Orientada a Objeto e finalizar com Estrutura de Dados.
* Isso se deve ao fato de eu precisar melhorar mais alguns conceitos básicos de programação e com isso melhorar minha lógica de desenvolvimento.

## O que aprendi ? 

##Sintaxe basica e conceitos de POO

* O que é um JDK, JVM e como preparar um ambiente de desenvolvimento java
* Aprendi a imprimir na tela o "Olá mundo"
* Método main para compilar todo código escrito
* Instanciar variáveis, criar funções, condicionais e laços de repetição.
* As diferenças de cada tipo de variável e como utilizar cada uma delas
* Em POO aprendi a criar uma classe e como criar uma referência para ela
* A diferença entre Objeto e Classe sendo que uma é a referência para outra
* Atributos sempre privados
* Getters e Setters

### Encapsulamento, Herança e Polimorfismo
* O conceito de encapsulamento, para que os atributos fiquem sempre protegidos.
* Herança e como utilizar para reduizir linhas de códigos e melhorar a leitura do código.
* A herança possui dois pilares muito importantes: Polimorfismo e reutilização de código.
* Com o polimorfismo podemos alterar o comportamento da classe mãe pela classe filha
* Ao usarmos a anotação @Override para métodos estamos sobreescrevendo o método da classe mãe
* Ao herdar uma classe não é passado o construtor da classe mãe, precisa criar um construtor na filha que aponte para o da mãe
* Sabemos que classes abstratas são relacionadas ao conceito de herança
* Não podemos instanciar classes abstratas, servem apenas para serem consumidas pelas classes filhas
* Existem também métodos abstratos que criamos unica e exclusivamente para polimorfismo
* Esses métodos não possuem corpo, ou seja, sempre são sobrescritos
* Isso torna obrigatório implementar esse método nas classes filhas

### Interface
* É uma classe abstrata com todos os métodos abstratos, no java
* Nada é concreto
* É a interface que define uma espécie de modelo que precisa ser implementado pela classe que a implementa
* Podemos fazer alusão a um contrato
* A classe assina os termos de que irá implementar os métodos da interface
* Como tudo é abstrato torna-se obrigatório a implementação
* É uma alternativa para o polimorfismo, não para reutilização de código

### Composição
* Classe com métodos concretos
* É usado esse conceito para reutilização de código
* Centralizamos uma série de instruções em uma classe e instânciamos uma referência no construtor de outra classe
* Dessa forma temos acesso e podemos centralizar a manutenção em apenas um lugar

### Call Stack
* No java temos uma ordem de execução, chamada de Pilha
* Por padrão sempre começa pelo main
* Apenas o método no topo da pilha é executado
* Quando o bloco de código, método, é finalizado ele é retirado do topo da pilha de execução

### Exceções
* Exceções são normais em diversas linguagens
* Elas aparecem quando temos algum tipo de problema de execução no software
* Podem acontecer com muita frequência, e elas existem para apontar problemas no nosso código
* Usamos para apontar o motivo do problema
* A EXCEÇÃO É UMA BOMBA !!! BOMB HAS BEEN PLANTED
* Uma bomba em cima da pilha de execução.
* Essa bomba faz com que toda a pilha seja ignorada até que exista uma tratativa para a execeção
* Para tratarmos uma exceção usamos o comando try e catch
* Esse processo faz com a execução da pilha não seja interrompida
* Podemos ter inúmeros catchs para as exceções específicas
* HEAP - É o lugar onde são guardado os objetos no mundo java
* Podemos também lançar as exceções quando quisermos usando o throw new Exception();
* Usando a diretiva <throw> para "jogar" a exceção com a referência criada
* A saída do método é imediata
* Existe outra linhagem de classes que extende a classe Throwable, que são as classes de Error
* Um erro que deu o nome da pagina famosa StackOverflow
* Esse erro é quando a pilha de métodos do java excedeu o seu limite e interrompe a execução do programa
* Porém as classes de erros não são manipuladas por nós devs, utiliizaremos apenas as Exceptions quando necessário
* Classes checked e unchecked
* Checked -> extende diretamente a classe Exception e obriga a inserir throws MinhaExececao na assinatura do método
* Unchecked -> extende diretamente da classe RuntimeException e não obriga essa inserção
* Verificado e não verificado pelo compilador
* O try/catch possui um bloco que separa e compila o conteúdo do seu bloco após o tratamento chamado finally

