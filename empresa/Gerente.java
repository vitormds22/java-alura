public class Gerente extends Funcionario implements Autenticavel {
      
      private int senha;
      private String usuario;

      public double getBonicacao(){
            return super.getSalario();
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