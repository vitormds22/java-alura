public class TestaMetodo {
      public static void main(String[] args) {
            Conta contaVitor = new Conta();
            contaVitor.saldo = 100;
            contaVitor.deposita(50);
            System.out.println(contaVitor.saldo);

            boolean sacado = contaVitor.saca(20);
            System.out.println(contaVitor.saldo);

            Conta contaFran = new Conta();
            contaFran.saldo = 1000;
            contaFran.transfere(200, contaVitor);
            System.out.println(contaFran.saldo);
            System.out.println(contaVitor.saldo);
      }
}
