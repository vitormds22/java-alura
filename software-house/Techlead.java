public class Techlead extends Funcionario implements Autenticavel{
      private Autenticador autenticador;
      
      public Techlead(){
            this.autenticador = new Autenticador();
      }
      @Override
      public boolean autenticou(int senha, String usuario) {
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
      public double getBonificacao() {
            return super.getSalario() + 200;
      }

      @Override
      public String getUsuario() {
            return this.autenticador.getUsuario();
      }
      
}
