public class Main {
      public static void main(String[] args) {
            Conta contaVitor = new Conta(001, 12345);
            System.out.println(contaVitor);
            
            Conta conta2 = new Conta(001, 12345);
            System.out.println(contaVitor);
            
            Conta conta3 = new Conta(001, 12345);
            System.out.println(contaVitor);
            
            contaVitor.deposita(1000);
            System.out.println(contaVitor.getSaldo());

            Cliente vitor = new Cliente("Vitor Machado", "14565856620", "Programador");
            System.out.println(vitor.getNome());

            contaVitor.setTitular(vitor);
            System.err.println(contaVitor.getTitular().getNome());

      }
}
