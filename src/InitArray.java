
public class InitArray {

	public static void main(String[] args) {
		
		double soma = 0;
		
		
		for(String x : args){
			soma += Double.parseDouble(x);
		}
		
		System.out.printf("Somas dos valores passados por linha de comando é : %.1f", soma);

	}

}
