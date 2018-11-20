
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(220,400);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<html>");
		sb.append("<h1>Live the Company</h1>");
		sb.append("<Table>");
		sb.append("<h2><tr><th>Evento</th></h2>");
		sb.append("<h2><th>Data</th></h2>");
		sb.append("<h2><th>Vado?</th></tr></h2>");
		sb.append("<h3><tr><th>Cocktail Party</th></h3>");
		sb.append("<h3><th>7 Dic</th></h3>");
		sb.append("<h3><th>Sì</th></tr></h3>");
		sb.append("<h3><tr><th>Colazione sociale</th></h3>");
		sb.append("<h3><th>12 Dic</th></h3>");
		sb.append("<h3><th>Sì</th></tr></h3>");
		sb.append("<h3><tr><th>Saluti di natale</th></h3>");
		sb.append("<h3><th>23 Dic</th></h3>");
		sb.append("<h3><th>No</th></tr></h3>");
		sb.append("</Table>");
		sb.append("</html>");
		// TODO Convertire lo StringBuilder in String
		String html= sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

