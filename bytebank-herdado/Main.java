public class Main {
    public static void main(String[] args) {
        //   Conta cc = new ContaCorrente(123, 123);
        //   cc.deposita(100);

        //   Conta cp = new ContaPoupanca(222, 222);
        //   cp.deposita(200);

        //   cc.transfere(10.0, cp);

        //   System.out.println("Saldo CC: " + cc.getSaldo());
        //   System.out.println("Saldo CP: " + cp.getSaldo());

        ContaCorrente cc = new ContaCorrente(123, 321);
        cc.deposita(200.0);
        try {
            cc.saca(230.0);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Exp: " + ex.getMessage());
        }

        System.out.println(cc.getSaldo());
    }  
}
