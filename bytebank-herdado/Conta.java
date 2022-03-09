public abstract class Conta {
      protected double saldo;
      private int agencia;
      private int numero;
      private Cliente titular;
      private static int total;

      public Conta(int agencia, int numero){
            Conta.total++;
            System.out.println("Total de contas criadas: " + Conta.total);
            this.agencia = agencia;
            this.numero = numero;
      }

      public abstract void deposita(double valor);

      public void saca(double valor) throws SaldoInsuficienteException {
            if(this.saldo < valor){
                 throw new SaldoInsuficienteException("Saldo: "  + this.saldo + ", Valor: " + valor);
            } 

            this.saldo -= valor;
      }

      public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
            this.saca(valor);
            destino.deposita(valor);
      }

      public static int getTotal() {
            return Conta.total;
      }

      public int getAgencia() {
            return agencia;
      }

      public void setAgencia(int agencia) {
            if(agencia <= 0){
                  System.out.println("Não pode valor menor ou igual a 0");
                  return;
            }
            this.agencia = agencia;
      }

      public int getNumero() {
            return numero;
      }

      public void setNumero(int numero) {
            if(numero <- 0){
                  System.out.println("Não pode valor menor ou igual a 0");
                  return;
            }
            this.numero = numero;
      }

      public double getSaldo() {
            return saldo;
      }

      public Cliente getTitular() {
            return titular;
      }

      public void setTitular(Cliente titular) {
            this.titular = titular;
      }
}