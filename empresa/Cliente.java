public class Cliente implements Autenticavel {
      
      private Autenticador autenticador;

      public Cliente(){
            this.autenticador = new Autenticador();
      }

      @Override
      public boolean autentica(int senha, String usuario){
            return this.autenticador.autentica(senha, usuario);
      }

      @Override
      public void setSenha(int senha) {
            this.autenticador.setSenha(senha);
      }
      
      @Override
      public void setUsuario(String usuario) {
            this.autenticador.setUsuario(usuario);
      }

      @Override
      public String getUsuario() {
           return this.autenticador.getUsuario();
      }
}
