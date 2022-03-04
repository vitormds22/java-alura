public class CalculadorImposto {
      private double totalImposto;

      public double registra(Tributavel tb) {
            double valor = tb.getValorImposto();
            return this.totalImposto += valor;
      }

      public double getTotalImposto() {
            return totalImposto;
      }
}
