public class MultiplosDe3 {
      public static void main(String[] args) {
            // Mais verbosa
            for (int numero = 0; numero <= 100; numero++) {
                  if(numero % 3 == 0) {
                        System.out.println(numero);
                  }
            }

            //Menos verbosa
            for (int numero = 3; numero < 100; numero+=3) {
                  System.out.println(numero);
            } 
      }
}
