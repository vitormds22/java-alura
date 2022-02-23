public class Moto extends Veiculos{
      private int garupa;

      public void ligar() {
           System.out.println("O carro ligou");
      }

      public String parar(){
           return "Carro parado...";
      }

      public void setGarupa(int garupa) {
            if(this.garupa == 0){
                  this.garupa = garupa;
            } else {
                  System.out.println("A moto já tem um garupa");
            }
      }

      public int getGarupa() {
            return garupa;
      }
}
