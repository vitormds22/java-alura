import java.util.Stack;

public class TesteDaPilha {
      public static void main(String[] args) {
            // Pilha pilha = new Pilha();

            // pilha.push("Vitor");
            // System.out.println(pilha);

            // pilha.push("Bruno");
            // System.out.println(pilha);

            // String r1 = pilha.pop();
            // System.out.println(r1);

            // String r2 = pilha.pop();
            // System.out.println(r2);
            
            // pilha.push("Roberto");

            // System.out.println(pilha);

            Stack<String> stack = new Stack<String>();
            stack.push("Vitão");
            stack.push("Mauricio");

            System.out.println(stack);

            System.out.println(stack.pop());
            System.out.println(stack);
            
            String nome = stack.peek();
            System.out.println(nome);

            System.out.println(stack);
      }
}
