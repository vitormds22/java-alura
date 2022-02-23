public class ControleBonificacao {
      
      private double somaBonificacao; 

      public void registra(Funcionario funcionario){
            double bonificacao = funcionario.getBonicacao();
            
            this.somaBonificacao =  bonificacao + this.somaBonificacao;
      }

      public double getSomaBonificacao() {
            return somaBonificacao;
      }
}
