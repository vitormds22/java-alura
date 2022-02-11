public class CriaConta {
      public static void main(String[] args) {
      //      CRIANDO UM OBJETO DO TIPO CONTA
            Conta primeiraConta = new Conta();
            primeiraConta.saldo = 200;
            System.out.println(primeiraConta.saldo);
            primeiraConta.saldo += 100;
            
            Conta segundaConta = new Conta();

            segundaConta.saldo = 500;
            System.out.println("Na primeira conta tem: " + primeiraConta.saldo);
            System.out.println("Na segunda conta tem: " + segundaConta.saldo);
            
            if(primeiraConta == segundaConta){
                  System.out.println("SÃO AS MESMAS!!");
            } else {
                  System.out.println("SÃO CONTAS DIFERENTES!!");
            }
      }
}
