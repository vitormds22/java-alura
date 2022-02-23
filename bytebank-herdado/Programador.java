public class Programador extends Funcionario{
      
      public double getBonicacao(){
            return super.getBonicacao() + super.getSalario();
      } 
}
