public class Celula {
      private Object elemento;
      private Celula anterior;
      private Celula proximo;
      
      public Celula(Object elemento) {
            this(null, elemento);
      }

      public Celula(Object elemento, Celula proximo) {
            this.elemento = elemento;
            this.proximo = proximo;
      }     

      public Celula(Object object, Object elemento2) {
      }

      public void setProximo(Celula proximo) {
            this.proximo = proximo;
      }

      public Celula getProximo() {
            return proximo;
      }

      public Object getElemento() {
            return elemento;
      }

      public Celula getAnterior() {
            return anterior;
      }

      public void setAnterior(Celula anterior) {
            this.anterior = anterior;
      }
}
