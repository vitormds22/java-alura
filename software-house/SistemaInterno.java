public class SistemaInterno {
      private int senha = 2222;
      private String usuario = "admin";
      
      public void autentica(Autenticavel auth) {
            boolean autenticou = auth.autenticou(this.senha, this.usuario);
            if(autenticou){
                  System.out.println("Você acessou o sistema, parabéns!");
            } else {
                  System.out.println("Você não pode acessar o sistema");
            }
      }
}
