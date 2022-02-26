public class Main {
    public static void main(String[] args) {
          Conta cc = new ContaCorrente(123, 123);
          cc.deposita(100);

          Conta cp = new ContaPoupanca(222, 222);
          cp.deposita(200);

          cc.transfere(10.0, cp);

          System.out.println("Saldo CC: " + cc.getSaldo());
          System.out.println("Saldo CP: " + cp.getSaldo());
    }  
}
