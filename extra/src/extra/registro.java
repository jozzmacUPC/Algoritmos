package extra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro extends JFrame implements ActionListener {

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
					registro frame = new registro();
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
	public registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(63, 45, 86, 20);
		contentPane.add(txtNumber);
		txtNumber.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(262, 44, 89, 23);
		contentPane.add(btnProcesar);
		
		txtS = new JTextArea();
		txtS.setBounds(40, 116, 316, 108);
		contentPane.add(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			doBtnProcesarActionPerformed(e);
		}
	}
	protected void doBtnProcesarActionPerformed(ActionEvent e) {
		
		int numero = 0,edad, eCivil,tServicio;
		
		numero = Integer.parseInt(txtNumber.getText());
		
		
		if(numero < 1000 || numero > 9999)
		{
			txtS.setText("Numero invalido");
		}
		else
		{
			edad = numero/100;
			numero=numero%100;
			eCivil = numero/10;
			tServicio = numero%10;
			
			txtS.setText("" + edad + " - "+ eCivil + " - "+ tServicio + "\n");
			
			if(edad < 18)
				txtS.append("Edad: "+edad+" - Menor de edad\n");
			else
				txtS.append("Edad: "+edad+" - Mayor de edad\n");
			
			switch (eCivil) {
			case 1:
				txtS.append("Estado Civil: Casado");
				break;
			case 2:
				txtS.append("Estado Civil: Soltero");
				break;
			case 3:
				txtS.append("Estado Civil: Divorciado");
				break;
			case 4:
				txtS.append("Estado Civil: Viudo");
				break;

			default:
				txtS.append("No existe");
				break;
			}
			
			txtS.append("\nTiempo de servicio: "+ tServicio + " a�os");
			
		
		}
	}
}
