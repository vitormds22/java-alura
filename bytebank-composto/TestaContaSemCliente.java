public class TestaContaSemCliente {
      public static void main(String[] args) {
            Conta conta = new Conta();
            System.out.println(conta.pegaSaldo());

            conta.titular = new Cliente();
            
            System.out.println(conta.titular);
            conta.titular.nome = "Vitor";
            System.out.println(conta.titular.nome);
      }
}
