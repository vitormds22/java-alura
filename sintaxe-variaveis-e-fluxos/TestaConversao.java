public class TestaConversao {
      public static void main(String[] args){
            double salario = 1270.50;
            // Outra forma de declarar números decimais, porém com o f no final
            // Utiliza menos espaço (bytes na memória)
            // float pontoFlutuante = 3.14f;

            // Valor convertido e arredondado para baixo: 1270
            int valor = (int) salario;
            System.out.println("=============");
            System.out.println(valor);
      
            // Outros tipos de variáveis, ou seja, até 9 digitos
            long numeroBemGrandeMesmo = 326841684;

            // Ou se quiser mais bota um L assim pra enfiar muita coisa
            long numeroBemMaior = 5468465316584635416L;

            // Valor pequeno e inteiro, utiliza menos bytes
            short numeroPequeno = 12345;

            // Valor bem menor
            byte b = 123;

            // BUG DO MILÊNIO, OLHA A LOUCURA QUE ACONTECE
            double valor1 = 0.2;
            double valor2 = 0.1;
            double total = valor1 + valor2;

            // Essa soma armazenada acima gera um número bem bizarro
            // 0.30000000000000004
            // Não é só no Java, em diversas linguagens de programação
            System.out.println("=============");
            System.out.println(total);
      }
}
