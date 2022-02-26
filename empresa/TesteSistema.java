public class TesteSistema {
      public static void main(String[] args) {
            Gerente vitor = new Gerente();
            vitor.setSenha(22);

            SistemaInterno si = new SistemaInterno();
            si.autentica(vitor);
      }
}
