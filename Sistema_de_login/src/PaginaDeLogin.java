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

public class PaginaDeLogin implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton btn_login = new JButton("Logar");
	JButton btn_limpar = new JButton("Limpar");
	JTextField user_id = new JTextField();
	JPasswordField user_senha = new JPasswordField();
	JLabel campo_id = new JLabel("Login:");
	JLabel campo_senha = new JLabel("Senha:");
	JCheckBox hide_senha = new JCheckBox("Mostrar Senha");
	JLabel pop_up = new JLabel("Insira as credenciais para prosseguir");
	HashMap<String,String> credenciais = new HashMap<String,String>();
	
	PaginaDeLogin(HashMap<String,String> credenciaisV0 ){
		credenciais = credenciaisV0;
		
		campo_id.setBounds(50, 100, 75, 25);
		campo_senha.setBounds(50, 150, 75, 25);
		
		pop_up.setBounds(100, 250, 250, 35);
		pop_up.setFont(new Font(null,Font.ITALIC,14));
		
		user_id.setBounds(125, 100, 200, 25);
		user_senha.setBounds(125, 150, 200, 25);
		user_senha.setEchoChar('*');
		
		btn_login.setBounds(125, 200, 100, 25);
		btn_login.addActionListener(this);
		
		btn_limpar.setBounds(225, 200, 100, 25);
		btn_limpar.addActionListener(this);
		
		hide_senha.setBounds(50, 230, 200, 25);
		hide_senha.addActionListener(this);

		
		frame.add(campo_id);
		frame.add(campo_senha);
		frame.add(pop_up);
		frame.add(user_id);
		frame.add(user_senha);
		frame.add(btn_login);
		frame.add(btn_limpar);
		frame.add(hide_senha);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(hide_senha.isSelected()) {
			user_senha.setEchoChar((char)0);
		}else {user_senha.setEchoChar('*');
		}
		
		if(e.getSource()==btn_limpar) {
			user_id.setText("");
			user_senha.setText("");
		}
		
		if(e.getSource()==btn_login) {
			
			String userID =  user_id.getText();
			String password = String.valueOf(user_senha.getPassword());
			 
			if(credenciais.containsKey(userID)) {
				if(credenciais.get(userID).equals(password)) {
					pop_up.setForeground(Color.green);
					pop_up.setText("Logado com sucesso");
					PaginaPrincipal welcomepg = new PaginaPrincipal();
				}else {
					pop_up.setForeground(Color.red);
					pop_up.setText("Senha incorreta");
					
				}
			}else {
				pop_up.setForeground(Color.red);
				pop_up.setText("Usuário incorreto");}
		
			} 
		
		
	}
} 
