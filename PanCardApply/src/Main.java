
public class Main {

	public static void main(String[] args) {

		DrivingLicenseApplication d1 = new DrivingLicenseApplication(20, "Amit", true, false);

		try {
			d1.ageVerification();
			d1.medicalCheckup();
			d1.policeVerification();
		} catch (Exception e) {
			System.out.println("You are not Eligible for Driving License");
		}

		DrivingLicenseApplication d2 = new DrivingLicenseApplication(25, "Ashu", true, true);

		try {
			d2.ageVerification();
			d2.medicalCheckup();
			d2.policeVerification();
		} catch (Exception e) {
			System.out.println("You are not Eligible for Driving License");
		}
	

	    DrivingLicenseApplication d3 = new DrivingLicenseApplication(30, "Raman", false, true);

	    try {
		d3.ageVerification();
		d3.medicalCheckup();
		d3.policeVerification();
	     }catch(Exception e) {
		System.out.println("You are not Eligible for Driving License");
	    }
}

}
