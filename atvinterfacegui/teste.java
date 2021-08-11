package atvinterfacegui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class teste {
	public static void main(String[] args) {
		JFrame janela = new JFrame();
		JPanel painelNome = new JPanel();
		JPanel painelEmail = new JPanel();
		JTextField txtNome = new JTextField(15);
		JTextField txtEmail = new JTextField(15);
		JButton bt = new JButton("Clique-me!");
		JButton btSair = new JButton("Sair");
		FlowLayout flow = new FlowLayout();
		painelNome.setLayout(flow);
		painelNome.add(new JLabel("Nome: "));
		painelNome.add(txtNome);
		painelEmail.setLayout(flow);
		painelEmail.add(new JLabel("Email: "));
		painelEmail.add(txtEmail);
		janela.setLayout(flow);
		janela.setSize(250,150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.add(painelNome);
		janela.add(painelEmail);
		janela.add(bt);
		janela.add(btSair);
		janela.setVisible(true);
		usuario user = new usuario();
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user.setNome(txtNome.getText());
				user.setEmail(txtEmail.getText());
				JOptionPane.showMessageDialog(null, user.toString());
			}
		});
		btSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
}