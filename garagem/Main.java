public class Main {
      public static void main(String[] args) {
            Garagem g = new Garagem(20);

            Carro carroVitor = new Carro();
            carroVitor.setMarca("Ferrari");
            carroVitor.setPassageiros(1);
            carroVitor.setPlaca("ABCD-1234");
            carroVitor.setVelocidadeMax(200);
            carroVitor.setDono("Vitor");

            System.out.println(carroVitor.getDono());
            carroVitor.ligar();
            carroVitor.setPassageiros(6);
            carroVitor.parar();

      }
}