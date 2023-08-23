 import java.util.HashMap;
 
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BD_Credenciais bd_credenciais = new BD_Credenciais();
		
		PaginaDeLogin pglogin = new PaginaDeLogin(bd_credenciais.getLoginInfo());
	
	
	
	}

}
