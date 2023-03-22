package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class propertyReader {

    static FileInputStream fileInput ;
    static {try {
        fileInput = new FileInputStream("Config.properties");
    } catch (Exception e) {
        e.getMessage();
    }
    }

    static Properties prop = new Properties();

    //load properties file
    static {try {
        prop.load(fileInput);
    } catch (Exception e) {
        e.getMessage();
    }}

    public static String getConfigValue(String configKey){
        return prop.getProperty(configKey);
    }

}
