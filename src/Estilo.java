import java.awt.Color;
import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class Estilo {
	public static Componentes c;
	
	public Estilo(Componentes com) {
		c = com;
	}
	public void aplicar() {
		c.lista.setSize(350, 200);
		c.lista.setEditable(false);
		
		c.valores.setLocation(20, 30);
		c.valores.setSize(280, 30);
		c.valores.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));	

		c.limpar.setForeground(Color.ORANGE.darker());
		c.calcular.setForeground(Color.GREEN.darker());
		
		c.calcular.setSize(100, 30);
		c.calcular.setLocation(240, 300);
		c.limpar.setSize(80, 30);
		c.limpar.setLocation(50, 300);
		c.adicionar.setSize(60, 29);
		c.adicionar.setLocation(310, 30);
		
		c.media.setSize(200,20);
		c.desvio.setSize(200,20);
		c.desvioPadrao.setSize(200,20);
		c.variancia.setSize(200,20);
		c.valoresLabel.setSize(100, 20);
		
		c.media.setLocation(20, 400);
		c.desvio.setLocation(170, 420);
		c.desvioPadrao.setLocation(20, 350);
		c.variancia.setLocation(260, 350);
		c.valoresLabel.setLocation(20, 10);
		c.lista.setLocation(20, 90);
		
		c.areaDesvios.setLocation(25, 450);
		c.areaDesvios.setSize(350, 200);
		c.areaDesvios.setEditable(false);
		c.areaDesvios.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 15));
	}
	
}
