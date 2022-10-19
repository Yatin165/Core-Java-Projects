import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DrivingLicenseApplication {
	
	private int age;
	private String name;
	private boolean medicalcheckup;
	private boolean policeverification;
	
	Log logger = LogFactory.getLog(DrivingLicenseApplication.class);
	
	
	public DrivingLicenseApplication(int age, String name, boolean medicalcheckup, boolean policeverification) {
		super();
		this.age = age;
		this.name = name;
		this.medicalcheckup = medicalcheckup;
		this.policeverification = policeverification;
		logger.info("Application applied by " + this.name);
	}

	
	
	
	public boolean ageVerification() throws AgeException {
		logger.info("Verifying Age");
		if(this.age < 18) {
			throw new AgeException("Age is less than 18");
		}else {
			logger.info("Age verification successful");
			System.out.println("AgeVerification successful");
			return true;
		}
	}
	
	public void medicalCheckup() throws MedicalCheckupException {
		logger.info("Doing Medical Checkup");
		if(this.medicalcheckup == false) {
			throw new MedicalCheckupException("Medical Exception Failed");
		}else {
			logger.info("Medical Checkup Successful");
			System.out.println("Medical checkup successful");
		}
	}
	
	
	public void policeVerification() throws PoliceVerificaitonExcepiton {
		logger.info("Doing Police Verificaiton");
		if(this.policeverification == false) {
			throw  new PoliceVerificaitonExcepiton("Police Verification Not Successful");
		}else {
			logger.info("Police Verificaiton successful");
			System.out.println("Police Verificaiton successful");
		}
	}

}
