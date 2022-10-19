
public class DataToDatabase {

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/telus","root","root");
		String sql="insert into LoginDetails (username,password) values (?,?)";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		prepareStatement.setString(1, username);
		prepareStatement.setString(2, password);
		prepareStatement.execute();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} cat
}
