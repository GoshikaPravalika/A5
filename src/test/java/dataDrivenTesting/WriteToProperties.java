package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//ctrl+shift+f
public class WriteToProperties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		Properties property=new Properties();
		property.load(fis);
		property.put("user2", "user");
		property.put("password2", "3456");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "Updated Successfully");
	}

}
