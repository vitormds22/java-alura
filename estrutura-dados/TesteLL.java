public class TesteLL {
      public static void main(String[] args) {
            System.out.println("=============LISTA LIGADA================");
            ListaLigada ll = new ListaLigada();

            System.out.println(ll);
            ll.adicionaNoComeco("vitor");
            System.out.println(ll);
            ll.adicionaNoComeco("Paulo");
            System.out.println(ll);
            ll.adicionaNoComeco("Roberto");
            System.out.println(ll);

            ll.adicionaNoFim("Marcelo");
            System.out.println(ll);

            ll.adicionaNaPosicao(2, "Gabriel");
            System.out.println(ll);

            Object x = ll.pega(2);
            System.out.println(x);

            System.out.println(ll.tamanho());
            ll.removeDoComeco();
            System.out.println(ll);
      }
}
