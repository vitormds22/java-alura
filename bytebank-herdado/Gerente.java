public class Gerente extends Funcionario {

      private int senha;

      public boolean autentica(int senha){
            if(this.senha == senha){
                  return true;
            } else {
                  return false;
            }
      }

      public void setSenha(int senha) {
            this.senha = senha;
      }

      public int getSenha() {
            return senha;
      }
      // public double getBonicacao(){
      //       return this.salario;
      // } 
}