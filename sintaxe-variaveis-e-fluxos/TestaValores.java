public class TestaValores {
      public static void main(String[] args) {
            // Exercício de entendimento do fluxo de leitura.
            // Sempre de cima para baixo
            int primeiroNumero = 5;
            int segundoNumero = 10;

            System.out.println(segundoNumero);

            // Aqui atribuimos o valor do primeiro numero ao segundo
            segundoNumero = primeiroNumero;
            // E logo após mudamos a var do primeiro para 10,
            primeiroNumero = 10;

            // Qual será o valor impresso abaixo ? SEM EXECUTAR EIN!!

            System.out.println(segundoNumero);
      }
}
