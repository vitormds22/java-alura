public class FuncionarioAutenticavel extends Funcionario{
      
      protected int senha;

      public boolean autentica(int senha){
            if(this.senha == senha){
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
      
}
