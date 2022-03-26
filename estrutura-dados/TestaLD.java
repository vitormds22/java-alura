public class TestaLD {
      public static void main(String[] args) {
            
            System.out.println("=============LISTA DUPLAMENTE LIGADA================");
            ListaDuplamente ld = new ListaDuplamente();

            System.out.println(ld);
            ld.adicionaNoComeco("vitor");
            System.out.println(ld);
            ld.adicionaNoComeco("Paulo");
            System.out.println(ld);
            ld.adicionaNoComeco("Roberto");
            System.out.println(ld);

            ld.adicionaNoFim("Marcelo");
            System.out.println(ld);

            ld.adicionaNaPosicao(2, "Gabriel");
            System.out.println(ld);

            Object y = ld.pega(2);
            System.out.println(y);

            System.out.println(ld.tamanho());
            ld.removeDoComeco();
            System.out.println(ld);

            ld.removeDoFim();
            ld.removeDoFim();
            System.out.println(ld);

            ld.removeNaPosicao(2);

            System.out.println(ld.contem("vitor"));
            System.out.println(ld.contem("Gabriel"));
      }
}
