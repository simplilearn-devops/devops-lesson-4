package devops.mocking;

public class LoginController {

	public LoginController( Authenticate authenticate ) {
	}
	
	public String getToken() {
		return "abcd1234" ;
	}

	public void authenticate( String user, String password ) {
	}

	public boolean isUserValid() {
		return false ;
	}

}
