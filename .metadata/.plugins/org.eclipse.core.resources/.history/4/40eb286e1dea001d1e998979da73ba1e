package extra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class capicua extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNumber;
	private JButton btnProcesar;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					capicua frame = new capicua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public capicua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(65, 47, 86, 20);
		contentPane.add(txtNumber);
		txtNumber.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(274, 46, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(55, 110, 252, 99);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			doBtnProcesarActionPerformed(e);
		}
	}
	protected void doBtnProcesarActionPerformed(ActionEvent e) {
		
		int numero = 0;
		int a, b, c;
		
		numero = Integer.parseInt(txtNumber.getText());
		
		if(numero < 100 || numero > 999)
		{
			txtS.setText("Numero invalido");
		}
		else
		{
			a=numero/100;
			numero = numero %100;
			b=numero/10;
			c=numero%10;
			
			txtS.setText("" + a + " - "+ b + " - "+ c + "\n");
			
			if(a == c)
			{
				
				txtS.append("El numero es capicua");
				
			}else
				txtS.append("El numero no es capicua");
			
		
		}
	}
}
