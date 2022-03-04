public class Programador extends Funcionario{
      private String stack;

      public void setStack(String stack) {
            this.stack = stack;
      }

      public String getStack() {
            return stack;
      }

      @Override
      public double getBonificacao() {
            return super.getSalario() + 100;
      }
      
}
