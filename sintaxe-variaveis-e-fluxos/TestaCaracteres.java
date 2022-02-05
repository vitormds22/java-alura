public class TestaCaracteres {
      public static void main(String[] args){
            // Para trabalhar com 1 caracter
            char letra = 'A';
            System.out.println(letra);

            // Na verdade mesmo ele pode ser considerado uma var do tipo numérico
            // Isso porque ele tem como base a tabela UNICODE com diversos caracteres na sua gama, podemos usar pela numeração
            char valor = 65;
            System.out.println(valor);

            String palavra = "Vitor Machado";
            System.out.println(palavra);

            // Quando somamos qualuqer coisa com a String é concatenado
            palavra = palavra + 2020;
            System.out.println(palavra);
      }
}
