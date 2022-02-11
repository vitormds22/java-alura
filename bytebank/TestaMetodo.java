public class TestaMetodo {
      public static void main(String[] args) {
            Conta contaVitor = new Conta();
            contaVitor.deposita(100);
            contaVitor.deposita(50);
            System.out.println(contaVitor.getSaldo());

            // boolean sacado = contaVitor.saca(20);
            System.out.println(contaVitor.getSaldo());

            Conta contaFran = new Conta();
            contaFran.deposita(1000);
            contaFran.transfere(200, contaVitor);
            System.out.println(contaFran.getSaldo());
            System.out.println(contaVitor.getSaldo());
      }
}
