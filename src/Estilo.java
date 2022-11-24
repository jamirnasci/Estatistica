import java.awt.Color;
import java.awt.Font;

public class Estilo {
	public static Componentes c;
	
	public Estilo(Componentes com) {
		c = com;
	}
	public void aplicar() {
		c.lista.setSize(350, 200);
		c.lista.setEditable(false);
		
		c.valores.setLocation(20, 60);
		c.valores.setSize(300, 30);
		c.valores.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));	

		c.calcular.setBackground(Color.green);
		c.limpar.setBackground(Color.orange);
		c.adicionar.setBackground(Color.LIGHT_GRAY);
		
		c.calcular.setSize(90, 30);
		c.calcular.setLocation(240, 330);
		c.limpar.setSize(80, 30);
		c.limpar.setLocation(50, 330);
		c.adicionar.setSize(40, 29);
		c.adicionar.setLocation(330, 60);
		
		c.media.setSize(200,20);
		c.desvio.setSize(200,20);
		c.desvioPadrao.setSize(200,20);
		c.variancia.setSize(200,20);
		c.valoresLabel.setSize(100, 20);
		
		c.media.setLocation(20, 430);
		c.desvio.setLocation(170, 450);
		c.desvioPadrao.setLocation(20, 380);
		c.variancia.setLocation(260, 380);
		c.valoresLabel.setLocation(20, 40);
		c.lista.setLocation(20, 100);
		
		c.areaDesvios.setLocation(25, 480);
		c.areaDesvios.setSize(350, 200);
		c.areaDesvios.setEditable(false);
	}
	
}
