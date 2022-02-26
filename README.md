# CURSO JAVA DO 0 COM A ALURA

* Nesse curso estou seguindo a trajetório do básico ao avançado com JAVA.
* O intuito é aprender desde a sintaxe básica, passar pela Programação Orientada a Objeto e finalizar com Estrutura de Dados.
* Isso se deve ao fato de eu precisar melhorar mais alguns conceitos básicos de programação e com isso melhorar minha lógica de desenvolvimento.

## O que aprendi ? 

###Sintaxe basica e conceitos de POO

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
