import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {
		JFrame f = new JFrame("Estatistica");
		Componentes c = new Componentes(f);
		c.inserirFrame();		
		Estilo e = new Estilo(c);
		e.aplicar();
		Eventos ev = new Eventos(c);
		ev.aplicar();
	}

}
