public class TestaEscopo {
      public static void main(String[] args) {
            System.out.println("Testando ESCOPOS");

            int idade = 20;
            int quantidadePessoa = 3;

            boolean acompanhado;

            if(quantidadePessoa >= 2){
                  acompanhado = true;
            } else {
                  acompanhado = false;
            }

            if (idade >= 18 || acompanhado){
                  System.out.println("Seja bem-vindo");
            } else {
                  System.out.println("Não pode entrar :(");
            }
      }
}
