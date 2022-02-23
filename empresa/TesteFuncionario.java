public class TesteFuncionario {
      public static void main(String[] args) {
            Funcionario vitor = new Funcionario();

            vitor.setNome("Vitor Machado");
            vitor.setCpf("41642955880");
            vitor.setSalario(1000.0);

            System.out.println(vitor.getNome());
            System.out.println(vitor.getCpf());
            System.out.println(vitor.getSalario());
            System.out.println(vitor.getBonicacao());
      }
}
