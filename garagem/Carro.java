public class Carro extends Veiculos {
      private int passageiros;

      public void setPassageiros(int passageiros) {
            if(passageiros <= 4){
                  this.passageiros = passageiros;
                  System.out.println("O carro tem " + this.passageiros + " passageiros");
            } else if(passageiros >= this.passageiros) {
                  System.out.println("O carro possui " + this.passageiros + " passageiros");
                  System.out.println("Só podem entrar no máximo 4");
            }
      }

      public int getPassageiros() {
            return passageiros;
      }

      @Override
      public void ligar() {
            System.out.println("O carro de placa: " + super.getPlaca() + " está ligado!");
      }

      @Override
      public void parar() {
            System.out.println("O carro de placa: " + super.getPlaca() + " está parado!");
      }

      @Override
      public void acelerar() {
            System.out.println("Acelerando até 200km/H");
      }
}
