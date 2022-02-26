public class Cliente implements Autenticavel {
      
      protected int senha;
      protected String usuario;

      @Override
      public boolean autentica(int senha, String usuario){
            if(this.senha == senha && this.usuario == usuario){
                  return true;
            } else {
                  return false;
            }
      }

      @Override
      public void setSenha(int senha) {
            this.senha = senha;
      }
      
      @Override
      public void setUsuario(String usuario) {
            this.usuario = usuario;
      }

      @Override
      public String getUsuario() {
            return usuario;
      }

}
