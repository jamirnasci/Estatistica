import java.awt.Color;
import java.awt.Font;

public class Estilo {
	public static Componentes c;
	
	public Estilo(Componentes com) {
		c = com;
	}
	public void aplicar() {
		
		Font labelFont = new Font("consolas", Font.PLAIN, 15);
		
		c.lista.setSize(350, 200);
		c.lista.setEditable(false);
		c.lista.setLocation(20, 90);
		c.lista.setFont(labelFont);
		
		c.valores.setLocation(20, 30);
		c.valores.setSize(280, 30);
		c.valores.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
		
		c.quadroValores.setLocation(130, 60);
		c.quadroValores.setSize(150, 30);
		c.quadroValores.setFont(labelFont);

		c.calcular.setForeground(Color.GREEN.darker());		
		c.calcular.setSize(100, 30);
		c.calcular.setLocation(270, 300);
		
		c.limpar.setSize(80, 30);
		c.limpar.setLocation(600, 300);
		c.limpar.setForeground(Color.ORANGE.darker());
		
		c.adicionar.setSize(60, 29);
		c.adicionar.setLocation(310, 30);		
		
		c.desvio.setSize(200,20);
		c.desvio.setLocation(750, 65);
		c.desvio.setFont(labelFont);
		
		c.desvioPadrao.setSize(200,20);
		c.desvioPadrao.setLocation(400, 180);
		c.desvioPadrao.setFont(labelFont);
		
		c.variancia.setSize(200,20);
		c.variancia.setLocation(400, 260);	
		c.variancia.setFont(labelFont);
		
		c.valoresLabel.setSize(100, 20);
		c.valoresLabel.setLocation(20, 10);
		c.valoresLabel.setFont(labelFont);
		
		c.media.setLocation(400, 100);
		c.media.setSize(200,20);
		c.media.setFont(labelFont);
		
		c.areaDesvios.setLocation(600, 90);
		c.areaDesvios.setSize(350, 200);
		c.areaDesvios.setEditable(false);
		c.areaDesvios.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
	}
	
}
