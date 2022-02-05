public class TestaCondicional {
      public static void main(String[] args) {
            System.out.println("Testando condicionais");

            int idade = 20;
            int quantidadePessoa = 1;

            if (idade >= 18) {
                  System.out.println("Maior que 18 anos");
                  System.out.println("Seja bem-vindo!!");
            } else {
                  if (quantidadePessoa >= 2){
                        System.out.println("Agora pode entrar, pois está acompanhado");
                  }
                  else {
                        System.err.println("Menor que 18 anos :(");
                  }
            }
      }
}
