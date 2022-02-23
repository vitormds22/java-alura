public class Conta {
      private double saldo;
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

      public void deposita(double valor){
            this.saldo += valor;
      }

      public boolean saca(double valor){
            if(this.saldo >= valor){
                  this.saldo -= valor;
                  System.out.println("Você sacou R$" + valor + ". Agora possui R$" + this.saldo + ".");
                  return true;
            } else {
                  System.out.println("Você não pode sacar pois não possui saldo suficiente."
                       +  "Seu saldo é de R$" + this.saldo + ".");
                  return false;
            }
      }

      public boolean transfere(double valor, Conta destino){
            if(this.saca(valor)){
                  destino.deposita(valor);
                  System.out.println("Você transferiu R$" + valor + " para a conta destino");
                  return true;
            } else {
                  System.out.println("Você não pode sacar pois não possui saldo suficiente."
                       +  "Seu saldo é de R$" + this.saldo + ".");
                       return false;
            }
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