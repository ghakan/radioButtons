package radiosButtons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class radiosButtons extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radiosButtons frame = new radiosButtons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public radiosButtons() {
		setTitle("radiosButtons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBounds(72, 32, 149, 23);
		contentPane.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(72, 67, 149, 23);
		contentPane.add(rdbtnNo);
		
		JRadioButton rdbtnQuizas = new JRadioButton("Quizas");
		rdbtnQuizas.setBounds(72, 104, 149, 23);
		contentPane.add(rdbtnQuizas);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rdbtnSi);
		grupo1.add(rdbtnNo);
		grupo1.add(rdbtnQuizas);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Entro al boton ok");
				if(rdbtnSi.isSelected()==true)
				{
					System.out.print("Seleccionó opción Si \n");
				}
				else if(rdbtnNo.isSelected()==true)
				{
					System.out.print("Seleccionó opción No \n");
				}
				else if(rdbtnQuizas.isSelected()==true)
				{
					System.out.print("Seleccionó opción Quizas \n");
				}
			}
		});
		btnOk.setBounds(72, 178, 117, 25);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Entro al boton Cancelar y limpio el grupo radio");
				grupo1.clearSelection();
			}
		});
		btnCancelar.setBounds(267, 178, 117, 25);
		contentPane.add(btnCancelar);
		
		JLabel lblteGustaEl = new JLabel("¿Te gusta el programa?");
		lblteGustaEl.setBounds(72, 9, 180, 15);
		contentPane.add(lblteGustaEl);
	}
}
