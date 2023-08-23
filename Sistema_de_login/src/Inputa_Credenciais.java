import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Inputa_Credenciais {
	JFrame frame = new JFrame();
	JPasswordField nova_senha = new JPasswordField();
	JCheckBox hide_senha = new JCheckBox("Mostrar Senha");
	JButton btn_login = new JButton("Logar");
	JButton btn_limpar = new JButton("Limpar");
	JTextField user_id = new JTextField();
	JLabel campo_id = new JLabel("userID:");
	JLabel campo_senha = new JLabel("userpassword:");
	JLabel pop_up = new JLabel("TESTEEEE");
	HashMap<String, String> credenciais = new HashMap<String, String>();

	public void actionPerformed(ActionEvent e) {
				if(hide_senha.isSelected()) {
					nova_senha.setEchoChar((char)0);
				}
		}

}
