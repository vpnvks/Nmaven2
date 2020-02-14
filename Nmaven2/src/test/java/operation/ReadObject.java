package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	
	Properties p = new Properties();
    public Properties getObjectRepository() {
        //Read object repository file
    	
        InputStream stream;
		try {
			stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\objects\\object.properties"));
			//load all objects
			p.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
         return p;
    	
         
    }

}
