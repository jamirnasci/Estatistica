import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.*;

public class Componentes {
	public JFrame f;
	
	public JButton calcular = new JButton("CALCULAR");
	public JButton limpar = new JButton("LIMPAR");
	public JButton adicionar = new JButton("Add");
	
	public JTextField valores = new JTextField();
	public TextArea lista = new TextArea();
	public TextArea areaDesvios = new TextArea();
	
	public JLabel valoresLabel = new JLabel("Valores: ");
	public JLabel quadroValores = new JLabel("Quadro de Valores");
	public JLabel media = new JLabel("Media: ");
	public JLabel desvio = new JLabel("Desvios: ");
	public JLabel desvioPadrao = new JLabel("D. Padrão: ");
	public JLabel variancia = new JLabel("Variancia: ");
	
	public Componentes(JFrame fr) {
		f = fr;
	}
	
	public void inserirFrame() {
		f.setSize(1000, 400);
		ImageIcon img = new ImageIcon("data/fundo.png");
		JLabel label = new JLabel(img);
		f.setContentPane(label);
		
		f.getContentPane().setBackground(Color.white);
		f.setVisible(true);
		f.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));

		f.setResizable(false);
		f.setLayout(null);
		
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
		f.add(quadroValores);
	}
}
