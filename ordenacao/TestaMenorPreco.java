public class TestaMenorPreco { 
      public static void main(String[] args) {

            Produto produtos[] = {
                  new Produto("Lamborguini", 1000000),
                  new Produto("Jipe", 46000),
                  new Produto("Brasília", 16000),
                  new Produto("Smart", 46000),
                  new Produto("Fusca", 17000),
                  null,
                  null,
                  null,
                  null,
              };

            int maisBarato = buscaMenor(produtos, 0, 4);
            
            System.out.println(maisBarato);
            System.out.println("O carro " + 
                        produtos[maisBarato].getNome() + 
                        " é o mais barato custando: " + 
                        produtos[maisBarato].getPreco());
      }

      private static  int buscaMenor(Produto[] produtos,int inicio, int termino) {
            int maisBarato = inicio;

            for (int i = 0; i <= termino; i++) {
                  if(produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                        maisBarato = i;
                  }
            }

            return maisBarato;
      }

      public int buscaMaior(Produto[] produtos) {
            int maisCaro = 0;

            for (int i = 0; i <= 4 ; i++) {
                  if(produtos[i].getPreco() > produtos[maisCaro].getPreco()) {
                        maisCaro = i;
                  }
            }

            return maisCaro;
      }

}