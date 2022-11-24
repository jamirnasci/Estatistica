import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Componentes {
	public Frame f;
	
	public Button calcular = new Button("CALCULAR");
	public Button limpar = new Button("LIMPAR");
	public Button adicionar = new Button("Add");
	
	public TextField valores = new TextField();
	public TextArea lista = new TextArea();
	public TextArea areaDesvios = new TextArea();
	
	public Label valoresLabel = new Label("Valores: ");
	public Label media = new Label("Media: ");
	public Label desvio = new Label("Desvios: ");
	public Label desvioPadrao = new Label("Desvio Padrão: ");
	public Label variancia = new Label("Variancia: ");
	
	public Componentes(Frame fr) {
		f = fr;
	}
	
	public void inserirFrame() {
		f.setSize(400, 700);
		f.setVisible(true);
		f.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

		f.setResizable(false);
		f.setLayout(null);
		f.setBackground(Color.white);
		
		f.add(media);
		f.add(desvio);
		f.add(variancia);
		f.add(desvioPadrao);
		f.add(calcular);
		f.add(valores);
		f.add(valoresLabel);
		f.add(lista);
		f.add(limpar);
		f.add(adicionar);
		f.add(areaDesvios);
	}
}
