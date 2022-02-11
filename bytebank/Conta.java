public class Conta {
      private double saldo = 100;
      private int agencia;
      private int numero;
      private Cliente titular = new Cliente();
      
      void  deposita(double valor) {
            this.saldo += valor ;
      }

      public boolean saca(double valor) {
            if (this.saldo >= valor) {
                  this.saldo -= valor;
                  System.out.println("Você sacou e seu saldo é: " + this.saldo);
                  return true;
            } else {
                  System.out.println("Você não possui saldo para saque");
                  return false;
            }
      }

      public boolean transfere(double valor, Conta destino){
            boolean sacado = this.saca(valor);
            if(sacado){
                  destino.deposita(valor);
                  System.out.println("Valor de " + valor  + " transferido para a conta destino.");
                  return true;
            } else {
                  System.err.println("Você não possui saldo para isso.");
                  return false;
            }
      }

      public double getSaldo(){
            return this.saldo;
      }

      public int getAgencia() {
            return this.agencia;
      }

      public int getNumero() {
            return this.numero;
      }

      public void setNumero(int numero) {
            this.numero = numero;
      }

      public Cliente getTitular() {
            return titular;
      }
}
