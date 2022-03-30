import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
      public static void main(String[] args) {
            Fila fila = new Fila();

            fila.adiciona("Vitor");
            fila.adiciona("Bruno");

            System.out.println(fila);
            
            String x1 = fila.remove();
            System.out.println(x1);
            System.out.println(fila);

            Queue<String> filaDoJava = new LinkedList<String>();
            filaDoJava.add("Vitão");
            filaDoJava.add("Brunão");

            String x2 = filaDoJava.poll();
            System.out.println(x2);
            System.out.println(filaDoJava);
      }
}
