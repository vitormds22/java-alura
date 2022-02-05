public class WhileToFor {
      public static void main(String[] args) {
            System.out.println("==========");
            System.out.println("LAÇO WHILE");
            int contador = 0; 
            
            while(contador <= 10) {
                  System.out.println(contador);
                  contador++;
            }
            
            System.out.println("==========");
            System.out.println("LAÇO FOR");

            for (int i = 0; i <= 10; i++) {
                  System.err.println(i);
            }
      }
}
