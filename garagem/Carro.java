public class Carro extends Veiculos {
      private int passageiros;

      public void ligar() {
           System.out.println("O carro ligou");
      }

      public String parar(){
           return "Carro parado...";
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
