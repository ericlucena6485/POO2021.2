package tela;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.CalculaIMC;

public class TelaCalculaIMC extends JFrame{

	private JPanel paineAltura = new JPanel();
	private JPanel painePeso = new JPanel();
	private JPanel paineJButton = new JPanel();

	private JLabel jlAltura = new JLabel("Altura");
	private JLabel jlPeso = new JLabel("Peso");
	private JLabel jlIMC = new JLabel("IMC");
	private JLabel jlResultado = new JLabel();

	private JTextField txtAltura = new JTextField(15);
	private JTextField txtPeso = new JTextField(15);

	private JButton jbCalc = new JButton("Calcula IMC");
	private JButton jbLimpar = new JButton("Limpar Campos");
	private JButton jbSair = new JButton("Sair");
	private Container painelPrincipal;
	private Container painelResulatado;

	public void montaJanela() {
		preparaPainel();
		preparaJFrame();
	}

	public void preparaPainel() {
		AbstractButton painelAltura = null;
		painelAltura.setLayout(new FlowLayout());
		painelAltura.add(jlAltura);
		painelAltura.add(txtAltura);

		AbstractButton painelPeso = null;
		painelPeso.setLayout(new FlowLayout());
		painelPeso.add(jlPeso);
		painelPeso.add(txtPeso);

		AbstractButton painelBotoes = null;
		painelBotoes.setLayout(new FlowLayout());
		painelBotoes.add(jbCalc);
		painelBotoes.add(jbLimpar);
		painelBotoes.add(jbSair);

		painelResulatado.setLayout(new FlowLayout());
		Container painelResultado = null;
		painelResultado.add(jlIMC);
		painelResultado.add(jlResultado);
	}

	public void preparaJFrame() {
		setLayout(new FlowLayout());
		Component painelAltura = null;
		add(painelAltura);
		Component painelPeso = null;
		add(painelPeso);
		Component painelBotoes = null;
		add(painelBotoes);
		Component painelResultado = null;
		add(painelResultado);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(400,200);
		setVisible(true);
	}

	public void preparaBotoes() {

		CalculaIMC calcula = new CalculaIMC();

		jbCalc.addActionListener(null);
		
		@Override
		public void actionPerformed(ActionEvent e) {
		 try {
			String altura = txtAltura.getText();
			String altura = txtPeso.getText();
			
			double IMC =  calcula.calcula(altura, peso);
			
		}

	}
}
