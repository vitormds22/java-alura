public class Main {
      public static void main(String[] args) {
            Garagem g = new Garagem(20);

            Carro carroVitor = new Carro();
            carroVitor.setMarca("Ferrari");
            carroVitor.setPassageiros(1);
            carroVitor.setPlaca("ABCD-1234");
            carroVitor.setVelocidadeMax(250);

            ControleVeiculo controle = new ControleVeiculo();

            System.out.println(controle.acelerar(carroVitor));
            System.out.println(controle.freiar(carroVitor));
      }
}