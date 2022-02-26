public class Autenticavel extends Funcionario{
      
      protected int senha;
      protected String usuario;

      public boolean autentica(int senha, String usuario){
            if(this.senha == senha && this.usuario == usuario){
                  return true;
            } else {
                  return false;
            }
      }

      @Override
      public double getBonicacao() {
            // TODO Auto-generated method stub
            return 0;
      }

      public void setSenha(int senha) {
            this.senha = senha;
      }

      public int getSenha() {
            return senha;
      }
      
      public void setUsuario(String usuario) {
            this.usuario = usuario;
      }

      public String getUsuario() {
            return usuario;
      }
}
