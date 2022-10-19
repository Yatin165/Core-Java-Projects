import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigurationDemo {

	public static void main(String[] args) throws ConfigurationException {

		Configurations configuration = new Configurations();
		PropertiesConfiguration config = configuration.properties("Configuration.properties");
		System.out.println(config.getProperty("name"));
	}

}