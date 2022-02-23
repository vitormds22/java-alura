public class ControleVeiculo extends Veiculos{
      
      public void ligar(Veiculos v) {
            System.out.println("O veículo de placa " + v.getPlaca() + "está ligado");
       }
 
       public double acelerar(Veiculos v){
             double acelerando = v.getVelocidadeMax();
 
             return acelerando;
       }
 
       public String parar(Veiculos v){
           return "O veículo com a placa " + v.getPlaca() + " está parado";
       }
 
       public String freiar(Veiculos v){
             System.out.println("Freiando...");
             return this.parar(v);
       }
}
