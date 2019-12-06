package cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */
public class ConfigurationReader {
<<<<<<< HEAD
    //this going to help us to read configuration.properties
    private static Properties properties;
=======
>>>>>>> origin/master

    private static Properties properties;
//  /Users/cybertekschool/IdeaProjects/Summer2019VATestNGSeleniumProject/src/test/java/com/cybertek/tests/d16_pom_2/PageSubtitlesTest.java
    static {

        try {
            // what file to read
            String path = "configuration.properties";
            // read the file into java, finds the file using the string path
            //provide access to files
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }
<<<<<<< HEAD
}
=======


}
>>>>>>> origin/master
