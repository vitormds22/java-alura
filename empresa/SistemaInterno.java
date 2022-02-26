public class SistemaInterno {
      private int senha = 2222;
      private String usuario = "admin";

      public void autentica(Autenticavel auth) {
            boolean autenticou = auth.autentica(this.senha, this.usuario);
            if(autenticou) {
                  System.out.println("Você pode entrar no sistema");
            } else {
                  System.out.println("Acesso negado!");
            }
      }
}
