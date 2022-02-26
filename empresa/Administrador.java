public class Administrador extends Funcionario implements Autenticavel{
      private int senha;
      private String usuario;

      @Override
      public double getBonicacao() {
            return 50;
      }

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
