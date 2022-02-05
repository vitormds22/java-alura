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
            
      }
}
