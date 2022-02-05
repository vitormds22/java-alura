public class TestaCondicional2 {
      public static void main(String[] args) {
            System.out.println("Testando condicionais 2");

            int idade = 18;
            int quantidadePessoa = 3;
            boolean acompanhado = quantidadePessoa >= 2;

            if (idade >= 18 && acompanhado){
                  System.out.println("Seja bem-vindo");
            } else {
                  System.out.println("Não pode entrar :(");
            }

      }
}
