package LoginSystem;
import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> logininfo = new HashMap<>();
	
	public IDandPasswords() {
		logininfo.put("username", "password");
	}
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}