package projeto_descricao_funcionarios;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

public class GuiTeste extends JFrame {
	
	public static void main(String[] args) {
		new GuiTeste();
	}
	
	public GuiTeste() {
		Funcionario func = new Funcionario("Pedro Almeida", 800.0f);
		Professor prof = new Professor("José Bonifácio", 1000.0f);
		JPanel panel = new JPanel();
		JLabel lblDescricao = new JLabel("Os dados referentes aos funcionários são: ");
		panel.add(lblDescricao);
		JTextArea campoDescricao = new JTextArea(10, 25);
		campoDescricao.append(func.toString() + "\n\n" +
							  "Professor >>" + "\n\tNome: " + prof.getNome() + "\n" + "\tSalário: R$ " + prof.getSalario() + "\n" + prof.toString());
		panel.add(campoDescricao);
		JButton btnFinalizar = new JButton("Finalizar");
		panel.add(btnFinalizar);
		this.add(panel);
		
		btnFinalizar.setToolTipText("Clique para finalizar consulta");
		btnFinalizar.setContentAreaFilled(true);
		
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				JOptionPane.showMessageDialog(null, "Obrigado pela visita!", "Finalizando Consulta", JOptionPane.PLAIN_MESSAGE);
				System.exit(1);
			}
		});
		
		this.setSize(280, 300);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension size = tk.getScreenSize();
		
		int xPos = (size.width / 2) - (this.getWidth() / 2);
		int yPos = (size.height / 2) - (this.getHeight() / 2);
		
		this.setVisible(true);
		this.setLocation(xPos, yPos);
		this.setResizable(false);
		this.setTitle("Dados dos Funcionários");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
