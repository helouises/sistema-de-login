import java.util.HashMap;

public class BD_Credenciais {

	HashMap<String,String> credenciais = new HashMap<String, String>();
	BD_Credenciais(){
		
		credenciais.put("Hanna","teste");
		credenciais.put("Paulo","naruto");
		credenciais.put("Joao","senha");
		credenciais.put("Pablo", "naruto");
		credenciais.put("Maria","teste123");
	}

	protected HashMap getLoginInfo(){
		return credenciais;
	}   
}

