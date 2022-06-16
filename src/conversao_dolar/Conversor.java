package conversao_dolar;

public class Conversor {
	public double dolar;
	public double qtdDolar;
		
	public double somaReais() {
		double total = dolar * qtdDolar;
		return (total * 0.06)+total;
	}

}
