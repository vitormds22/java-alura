public abstract class Funcionario {

      private String nome;
      private int idade;
      private double salario;

      public abstract double getBonificacao();
      
      public void setIdade(int idade) {
            this.idade = idade;
      }

      public int getIdade() {
            return idade;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }
      
      public String getNome() {
            return nome;
      }

      public void setSalario(double salario) {
            this.salario = salario;
      }

      public double getSalario() {
            return salario;
      }
}