public class Veiculos {
      private String marca;
      private double velocidadeMax;
      private String placa;

      public void ligar() {
            System.out.println("O veículo ligou");
       }
 
       public double acelerar(){
             double acelerando = this.getVelocidadeMax();
 
             return acelerando;
       }
 
       public String parar(){
            return "Veículo parado...";
       }
 
       public String freiar(){
             System.out.println("Freiando...");
             return this.parar();
       }
 
      public String getMarca() {
            return marca;
      }

      public void setMarca(String marca) {
            this.marca = marca;
      }

      public String getPlaca() {
            return placa;
      }

      public void setPlaca(String placa) {
            this.placa = placa;
      }

      public double getVelocidadeMax() {
            return velocidadeMax;
      }

      public void setVelocidadeMax(double velocidadeMax) {
            this.velocidadeMax = velocidadeMax;
      }
}
