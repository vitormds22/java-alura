public class Carro extends Veiculos {
      private int passageiros;

      public void ligar() {
           System.out.println("O carro ligou");
      }

      public double acelerar(Veiculos veiculo){
            double acelerando = veiculo.getVelocidadeMax();

            return acelerando;
      }

      public String parar(){
           return "Carro parado...";
      }

      public String freiar(){
            System.out.println("Freiando...");
            return this.parar();
      }

      public void setPassageiros(int passageiros) {
            if(this.passageiros <= 4){
                  this.passageiros = passageiros;
            } else {
                  System.out.println("O carro está lotado");
            }
      }

      public int getPassageiros() {
            return passageiros;
      }
}
