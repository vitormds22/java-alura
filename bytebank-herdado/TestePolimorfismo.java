public class TestePolimorfismo {
      public static void main(String[] args) {
            Funcionario vitor = new Programador();
            vitor.setNome("Vitor");
            vitor.setSalario(3500.00);
            vitor.getBonicacao();

            Funcionario pedro = new Gerente();
            pedro.setNome("Pedro");
            pedro.setSalario(15000.00);
            System.out.println(pedro.getBonicacao());

            ControleBonificacao controle = new ControleBonificacao();
            controle.registra(vitor);
            controle.registra(pedro);
            
            System.out.println(controle.getSomaBonificacao());
      }
}
