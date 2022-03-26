import java.util.Arrays;

public class Vetor {
      private Aluno [] alunos = new Aluno[100];

      // Variável auxiliar para melhorar a performance do algoritimo
      private int totalDeAlunos = 0;
     
      // Se o Array lotar ele dobra o tamanho com null
      public void garanteEspaco() {
            // Se estiver lotado
            if(totalDeAlunos == alunos.length){
                  // Cria um novo array com o dobro do tamanho atual
                  Aluno [] novoArray = new Aluno[alunos.length * 2];
                  // Percorre o array antigo
                  for (int i = 0; i < alunos.length; i++) {
                        // Copia para o novo array
                        novoArray[i] = alunos[i];
                  }
                  // Troca a referência para o novo array
                  this.alunos = novoArray;
            }
      }

      public void adiciona(Aluno aluno) {
            this.garanteEspaco();
            // Usando a váriavel para indicar a posição atual que o Array está e inserindo o valor passado no parâmetro
            this.alunos[totalDeAlunos] = aluno;
            // Adicionando 1 ao contador de posições preenchidas do Array
            this.totalDeAlunos++;
      }

      private boolean posicaoValida(int posicao) {
            return posicao >= 0 && posicao <= totalDeAlunos;
      }


      public void adiciona(Aluno aluno, int posicao) {

            this.garanteEspaco();

            if(!posicaoValida(posicao)){
                  throw new IllegalArgumentException("Posição inválida");
            }

            for(int i = totalDeAlunos - 1; i >= posicao; i-=1) {
                  alunos[i + 1] = alunos[i];
            }

            alunos[posicao] = aluno;
            totalDeAlunos++;
      }

      // Adicionar um Aluno O(n) 
      // public void adiciona(Aluno aluno) {
      //       // Percorre todo o Array
      //       for (int i = 0; i < alunos.length; i++) {
      //             // Verifica se a posição atual é nula
      //             if(alunos[i] == null) {
      //                   // Adiciona na posição atual o aluno no array
      //                   alunos[i] = aluno;
      //                   // Quebra o looping
      //                   break;
      //             }
      //       }
      // }

      private boolean posicaoOcupada(int posicao) {
            return posicao >= 0 && posicao < totalDeAlunos;
      }

      // Buscar um aluno a partir da posição
      public Aluno pega(int posicao) {
            if(!posicaoOcupada(posicao)){
                  throw new IllegalArgumentException("Posição inválida");
            }
            return alunos[posicao];
      }
      // Excluir um aluno a partir da posição
      public void remove(int posicao) {
            for(int i = posicao; i < totalDeAlunos;  i++) {
                  this.alunos[i] = this.alunos[i + 1];
            }
            totalDeAlunos--;
      }

      // Descobre se o aluno está na lista
      // Função O(n), pois varia com a quantidade de elementos no Array.
      public boolean contem(Aluno aluno) {
            // Percorre o array
            for (int i = 0; i < alunos.length; i++) {
                  // Valida se o aluno passado é igual a posição atual
                 if(aluno.equals(alunos[i])){
                       return true;
                 }
            }
            return false;
      }

      // Diz o tamanho do vetor
      public int tamanho() {
            return totalDeAlunos;
      }

      // Imprimir o vetor
      public String toString() {

            return Arrays.toString(alunos);
      }
}
