import java.util.ArrayList;

public class Calculos {
	public static double media;
	public static ArrayList<Double> desvios;
	public static String tabelaDesvio="";
	
	public static double media(ArrayList<Double> lista) {
		double soma = 0;
		for(double el : lista) {
			soma += el;
		}
		double mediaCalc = soma / lista.size();
		media = mediaCalc;
		return mediaCalc;
	}
	public static void desvio(ArrayList<Double> lista) {
		desvios = new ArrayList<Double>();
		double d;
		for(double el : lista) {
			d = Math.abs(el - media);
			desvios.add(d);
			tabelaDesvio += "Valor: "+String.format("%.2f", el)+" - - - Media: "+String.format("%.2f",media)+" - - - Desvio: "+String.format("%.2f", d)+"\n";
		}
	}
	public static double desvioPadrao() {
		return Math.sqrt(variancia());
	}
	public static double variancia() {
		ArrayList<Double> somaQuadrado = new ArrayList<Double>();
		double soma = 0;
		for(double el : desvios) {
			somaQuadrado.add(el * el);
		}
		for(double el : somaQuadrado) {
			soma += el;
		}
		return soma / somaQuadrado.size();
	}
}
