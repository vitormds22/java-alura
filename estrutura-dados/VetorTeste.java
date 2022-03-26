public class VetorTeste {
      public static void main(String[] args) {
            // Criou dois alunos
            Aluno a1 = new Aluno("João");
            Aluno a2 = new Aluno("José");

            // Cria o objeto Vetor
            Vetor lista = new Vetor();

            // Tamanho do Vetor = 0
            System.out.println(lista.tamanho());

            // Adiciona os alunos no Vetor
            lista.adiciona(a1);
            // Tamanho do Vetor = 1
            System.out.println(lista.tamanho());
            
            lista.adiciona(a2);
            // Tamanho do Vetor = 2
            System.out.println(lista.tamanho());

            // Imprime o Vetor completo
            System.out.println(lista);

            Aluno a3 = new Aluno("Vitor");
            lista.adiciona(a3, 1);
            System.out.println(lista.contem(a3));
            // System.out.println(lista);

            for (int i = 0; i < 300; i++) {
                  Aluno y = new Aluno("Josevaldo" + i);
                  lista.adiciona(y);
            }
            System.out.println(lista);
            
            // Tratamento de exceção caso passe o um valor de posição inválida
            // Aluno x = lista.pega(158);
            // System.out.println(x);


      }
}
