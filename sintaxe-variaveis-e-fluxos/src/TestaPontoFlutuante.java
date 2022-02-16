public class TestaPontoFlutuante {
	public static void main(String[] args) {
		double salario;
		salario = 1250.70;
			
		System.out.println("Meu salário é: " + salario);
		
		// Podemos usar inteiros para tipo de ponto flutuante
		// double idade = 37;
		
		// Podemos fazer contas dentro da variavel
		double divisao = 3.14 / 2;
		System.out.println("Divisão de um ponto flutuante por inteiro: " + divisao);
		
		// Podemos fazer até divisão de inteiros que o resutado seria com ponto flutuante
		// Mas o java força o retorno inteiro :(
		int outraDivisao = 5 / 2;
		System.out.println("Divisão de inteiros: " + outraDivisao);
		
		// Mas para termos o resultado correto
		double novaTentativa = 5.0 / 2;
		System.out.println("Divisão de um double por int " + novaTentativa);
		
	}
}
