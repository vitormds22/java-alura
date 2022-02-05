public class ImpostoDeRenda {
      public static void main(String[] args) {
            double salario = 1900;
            
            boolean irMinimo = salario >= 1900.00 && salario <= 2800.00; // IR é de 7,5% e deduz R$ 142 
            boolean irMedio = salario >= 2800.01 && salario <= 3751.00; // IR é de 15% e deduz R$ 350 
            boolean irMaximo = salario >= 3751.01 && salario <= 4664.00; // IR é de 22.5% e deduz R$ 636

            if(irMinimo) {
                  System.out.println("O imposto de renda terá uma taxa de 7.5% e pode deduzir o valor de R$ 142,00");
            } else if (irMedio) {
                  System.out.println("O imposto de renda terá uma taxa de 15% e pode deduzir o valor de R$ 350,00");
            } else if (irMaximo) {
                  System.out.println("O imposto de renda terá uma taxa de 22.5% e pode deduzir o valor de R$ 636,00");     
            }
      }
}
