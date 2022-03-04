public class Autenticador {
      private int senha;
      private String usuario;

      public boolean autentica(int senha, String usuario){
            if(this.senha == senha && this.usuario == usuario) {
                  return true;
            } else {
                  return false;
            }
      }

      public void setSenha(int senha) {
            this.senha = senha;
      }

      public void setUsuario(String usuario) {
            this.usuario = usuario;
      }

      public String getUsuario() {
            return this.usuario;
      }
}