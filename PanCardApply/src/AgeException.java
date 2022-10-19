import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AgeException extends Exception{
	
	Log logger = LogFactory.getLog(DrivingLicenseApplication.class);
	
	public AgeException(String exp) {
		super(exp);
		logger.info("Age verification failed due to age is less than 18");
	}

}
