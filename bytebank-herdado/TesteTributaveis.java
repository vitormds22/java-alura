public class TesteTributaveis {
      public static void main(String[] args) {
            ContaCorrente cc = new ContaCorrente(111, 111);
            cc.deposita(100);

            SeguroDeVida sv = new SeguroDeVida();

            CalculadorImposto ci = new CalculadorImposto();
            ci.registra(cc);
            ci.registra(sv);

            System.out.println(ci.getTotalImposto());

      }
}
