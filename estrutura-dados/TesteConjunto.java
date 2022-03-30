import java.util.HashSet;
import java.util.Set;

public class TesteConjunto {
      public static void main(String[] args) {
            Conjunto conjunto = new Conjunto();
            conjunto.adiciona("Vitor");
            System.out.println(conjunto);

            conjunto.adiciona("Valter");
            System.out.println(conjunto);

            conjunto.adiciona("Bruno");
            System.out.println(conjunto);
            
            conjunto.adiciona("Breno");
            System.out.println(conjunto);
            
            conjunto.adiciona("Ana");
            System.out.println(conjunto);

            conjunto.remove("Ana");
            System.out.println(conjunto);
            
            Set<String> conjuntoDoJava = new HashSet<String>();
            conjuntoDoJava.add("Vitão");
            conjuntoDoJava.add("Mauricio");
            conjuntoDoJava.add("Marcelo");
            conjuntoDoJava.add("Breno");
            
            System.out.println(conjuntoDoJava);
      }
}
