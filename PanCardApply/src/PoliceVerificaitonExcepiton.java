import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PoliceVerificaitonExcepiton extends Exception {
	
	Log logger = LogFactory.getLog(DrivingLicenseApplication.class);

	public PoliceVerificaitonExcepiton (String exp) {
		super(exp);
		logger.info("Police Verificaiton failed");

	}
}
