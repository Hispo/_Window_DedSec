/*
 * @author Edson F.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingConstants;
import javax.print.DocFlavor.URL;
import javax.swing.JButton;


public class DedSec extends JFrame{
	
	private JPanel panel;
	private JLabel message;
	private JPanel buttonJPanel;
	private JButton[] buttons;
	private Container container;
	
	public DedSec() {
		super("DedSec");
		this.setUndecorated(true);
		this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
		panel = new JPanel();
		
		java.net.URL url = this.getClass().getResource("_hacker.png");
		Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
		this.setIconImage(imagemTitulo);
		
		container = this.getContentPane();
		container.setBackground(Color.lightGray);
		
		buttons = new JButton[3];
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(1, buttons.length));
		
		// set font
		Font f = new Font("Consolas", Font.BOLD, 14);
		
		message = new JLabel("Are you sure that you're sure?");
		message.setFont(f);
		message.setHorizontalAlignment(SwingConstants.CENTER);
		add(message);

		// Cria e adiciona botões		
		buttons[0] = new JButton("#WTF");
		buttons[1] = new JButton("YES");
		buttons[2] = new JButton("NO");
		
		for(int count = 0; count < buttons.length; count++)
			buttons[count].setBackground(Color.lightGray);
		
		buttonJPanel.add(buttons[0]);
		buttonJPanel.add(buttons[1]);
		buttonJPanel.add(buttons[2]);
		add(buttonJPanel, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		DedSec dedsec = new DedSec();
		dedsec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dedsec.setSize(350, 150);
		dedsec.setVisible(true);
		dedsec.setLocationRelativeTo(null); // CONFIGURA PARA APARECER NO CENTRO DA TELA
		dedsec.setResizable(false); // TAMANHO DA TELA INALTERÁVEL
	}
}