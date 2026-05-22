package Fundamentos;

public class SequeniaFibonacci {

	public static void main(String[] args) {

		int n = 10;

		int primeiro = 0;
		int segundo = 1;

		System.out.println("Sequência de Fibonacci:");

		for (int i = 0; i < n; i++) {
			System.out.print(primeiro + " ");

			int proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}
	}
}
