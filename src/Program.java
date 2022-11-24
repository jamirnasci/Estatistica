import java.awt.Frame;

public class Program {

	public static void main(String[] args) {
		Frame f = new Frame("Estatistica");
		Componentes c = new Componentes(f);
		c.inserirFrame();		
		Estilo e = new Estilo(c);
		e.aplicar();
		Eventos ev = new Eventos(c);
		ev.aplicar();
	}

}
