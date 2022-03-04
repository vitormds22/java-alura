public interface Autenticavel {

      public abstract boolean autenticou(int senha, String usuario);

      public void setSenha(int senha);

      public void setUsuario(String usuario);

      public String getUsuario();
}
