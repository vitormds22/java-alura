public class TesteBanco {
      public static void main(String[] args) {
            Cliente vitor = new Cliente();
            // vitor.nome = "Vitor Machado";
            // vitor.cpf = "416.429.588-08";
            // vitor.profissao = "Dev Front end";

            Conta contaVitor = new Conta();
            contaVitor.deposita(100);
            
            // Associação da conta com o cliente
            // contaVitor.titular = vitor;
            // System.out.println(contaVitor.titular.nome);
      }
}