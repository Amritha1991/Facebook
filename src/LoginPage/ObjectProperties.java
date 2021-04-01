package LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectProperties {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("C:\\Users\\sakthi\\eclipse-workspace\\FaceBook Login\\config.properties");
		p.load(f);
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("browser"));
		
		

	}

}
