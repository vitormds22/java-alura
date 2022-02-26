public interface Autenticavel {
     
      public abstract boolean autentica(int senha, String usuario);

      public void setSenha(int senha);
      
      public void setUsuario(String usuario);

      public String getUsuario();
}
