package fi.unju.edu.ar.punto1;

public class Numero {
	public int calcularFatorial(int numero) {
		int numeroFactorial=1;
		for (int i=1; i<=numero;i++) {
			numeroFactorial=numeroFactorial*i;
		}
		return numeroFactorial;
	}
}
