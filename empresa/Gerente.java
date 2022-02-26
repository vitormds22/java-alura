public class Gerente extends FuncionarioAutenticavel {

      public void setSenha(int senha) {
            super.senha = senha;
      }

      public int getSenha() {
            return senha;
      }

      public double getBonicacao(){
            return super.getSalario();
      } 
}