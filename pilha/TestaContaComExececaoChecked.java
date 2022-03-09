public class TestaContaComExececaoChecked {
      public static void main(String[] args) {
            
            Conta c = new Conta();

            try {
                  c.deposita();
            } catch (MinhaExececao ex) {
                  System.out.println("Tratamento...");
                  // ex.getMessage();
            }
      }
}
