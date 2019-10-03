package Com_Tesco;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    //both inbuilt in java class
    //object created
    static FileInputStream fileInputStream;
    //object created
    static Properties properties;

    //reusable method for go to get property from config.properties


    public String getProperty(String key) {

        properties = new Properties();

        try {
            fileInputStream = new FileInputStream("src\\test\\Resources\\FeatureFiles\\config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);


    }

}

