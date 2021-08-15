package classes;

public class LoginSession {
	private static boolean loginStatus;
	private static int role;

	public static boolean isLoginStatus() {
		return loginStatus;
	}

	public static void setLoginStatus(boolean loginStatus) {
		LoginSession.loginStatus = loginStatus;
	}

	public static int getRole() {
		return role;
	}

	public static void setRole(int role) {
		LoginSession.role = role;
	}
	
}
