public class TesteGerente {
      public static void main(String[] args) {
            Gerente pedro = new Gerente();
            pedro.setNome("Pedro");
            pedro.setCpf("1234567898");
            pedro.setSalario(10000.0);
            pedro.setSenha(2222);

            System.out.println(pedro.getCpf());
            System.out.println(pedro.getNome());
            System.out.println(pedro.getSalario());

            boolean autenticou = pedro.autentica(2222);
            System.out.println(autenticou);

            System.out.println(pedro.getBonicacao());
      }
}
