public class TestaGetSet {
      public static void main(String[] args) {
            Conta conta = new Conta();
            conta.setNumero(1337);
            System.out.println(conta.getNumero());

            Cliente vitor = new Cliente();
            // conta.titular = vitor;
            vitor.setNome("Vitor Machado");
            conta.setTitular(vitor);

            System.out.println(conta.getTitular().getNome());
            
            conta.getTitular().setProfissao("Programador");
      }
}
