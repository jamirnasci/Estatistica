import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Eventos {

	public static Componentes c;
	ArrayList<Double> valNum = new ArrayList<Double>();

	public Eventos(Componentes comp) {
		c = comp;
	}
	
	public void aplicar() {
		c.f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
			
		});		
		
		c.calcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.media.setText("Media: "+String.format("%.2f",Calculos.media(valNum)));				
				Calculos.desvio(valNum);
				c.desvio.setText("Desvios: ");
				c.desvioPadrao.setText("D. Padrão: "+String.format("%.2f",Calculos.desvioPadrao()));
				c.variancia.setText("Variancia: "+String.format("%.2f",Calculos.variancia()));
				
				c.areaDesvios.setText(Calculos.tabelaDesvio);
			}
		});

		c.adicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c.lista.setText(c.lista.getText()+c.valores.getText()+"\n");
				try {
					valNum.add(Double.parseDouble(c.valores.getText()));
				}catch(Exception e1){
					JOptionPane.showMessageDialog(c.f,"Erro de entrada");
				}
			}
		});

		c.limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c.lista.setText("");				
				valNum.clear();

				c.media.setText("Media: ");
				c.desvio.setText("Desvios: ");
				c.desvioPadrao.setText("D. Padrão: ");
				c.variancia.setText("Variancia: ");	
				c.areaDesvios.setText("");
				Calculos.tabelaDesvio = "";
			}
		});
	}
		
}

