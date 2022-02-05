public class LacosEncadeados {
      public static void main(String[] args) {

            for (int numerando = 1; numerando <= 10 ; numerando++) {
                  // System.out.print(" " + numerando);
                  for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
                        System.out.print(numerando * multiplicador);
                        System.err.print(" ");
                  }
                  System.err.println();
            }
      }
}
