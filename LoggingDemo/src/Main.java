import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {

	public static void main(String[] args) {
		Log logger = LogFactory.getLog(Main.class);

		UserAuthentication user = new UserAuthentication();
		logger.debug("User is logging");
		user.loginUser(" ", "mu");
	}

}
