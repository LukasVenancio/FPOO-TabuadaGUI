package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Calculador;

public class Tela {

	public void criarTela() {

		Color lightGreen = new Color(102, 153, 102);
		Color lightBlue = new Color(0, 110, 255);

		JFrame tela = new JFrame("Tabuada");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(500, 400);
		tela.setLayout(null);

		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 15, 150, 40);
		lblTitulo.setFont(new Font("Serif", Font.BOLD, 30));
		lblTitulo.setForeground(lightBlue);

		JLabel lblMultiplicando = new JLabel("Multiplicando:");
		lblMultiplicando.setBounds(80, 50, 90, 70);
		lblMultiplicando.setFont(new Font("Serif", Font.PLAIN, 14));

		JLabel lblMultiplicador = new JLabel("Máximo multiplicador:");
		lblMultiplicador.setBounds(30, 80, 150, 100);
		lblMultiplicador.setFont(new Font("Serif", Font.PLAIN, 14));

		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(165, 65, 100, 40);

		JTextField txtMultiplicador = new JTextField();
		txtMultiplicador.setBounds(165, 115, 100, 40);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(30, 190, 235, 55);
		btnCalcular.setFont(new Font("Serif", Font.BOLD, 24));
		btnCalcular.setForeground(Color.white);
		btnCalcular.setBackground(lightGreen);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(30, 270, 235, 55);
		btnLimpar.setFont(new Font("Serif", Font.BOLD, 24));
		btnLimpar.setForeground(Color.white);
		btnLimpar.setBackground(Color.red);

		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(290, 60, 100, 20);
		lblResultado.setFont(new Font("Serif", Font.BOLD, 14));
		lblResultado.setForeground(lightBlue);

		DefaultListModel<String> listModel = new DefaultListModel<String>();
		JList<String> lstTabuada = new JList<>(listModel);
		lstTabuada.setBounds(290, 80, 160, 245);

		JScrollPane scrollPane = new JScrollPane(lstTabuada);
		scrollPane.setBounds(290, 80, 160, 245);

		tela.getContentPane().add(lblTitulo);
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(lblMultiplicador);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(txtMultiplicador);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(lblResultado);
		tela.getContentPane().add(scrollPane);

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int multiplicando = Integer.parseInt(txtMultiplicando.getText());
				int multiplicador = Integer.parseInt(txtMultiplicador.getText());

				int contador = 0;

				Calculador calculador = new Calculador();

				for (contador = 0; contador <= multiplicador; contador++) {
					calculador.setResultado(multiplicando, contador);
					listModel.addElement(multiplicando + " X " + contador + " = " + calculador.getResultado());

				}

			}
		});

		btnLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				listModel.clear();
				lstTabuada.setModel(listModel);
				txtMultiplicando.grabFocus();
				txtMultiplicando.setText(null);
				txtMultiplicador.setText(null);

			}
		});

		tela.setVisible(true);
	}

}
