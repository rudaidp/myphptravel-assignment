package utils;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

import org.apache.logging.log4j.*;



public class PropertyHandler {

       private static String propertyFile = "src//test//resources//Data.properties";
       private static Logger log = LogManager.getLogger(PropertyHandler.class);

       //public static PropertyHandler dataProperty = new PropertyHandler("src//test//resources//Data.properties");
       
       
       public PropertyHandler(String filePath) {
              propertyFile = filePath;
       }

       private static Properties readFromFile() {
              Properties properties = new Properties();
              try (InputStreamReader fileReader = new InputStreamReader(new FileInputStream(propertyFile))) {
                     properties.load(fileReader);
                     fileReader.close();
              } catch (IOException e) {
            log.error("Property file not found!");
                     e.printStackTrace();
              }

              return properties;
       }

       public static String getValue(String propertyName) {
              String propertyValue;
              propertyValue = (readFromFile().getProperty(propertyName));
              return propertyValue;
       }

       public static void updateValue(String propertyName, String newValue) {
              Properties dataProperties = readFromFile();

              try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(propertyFile))) {
                     dataProperties.setProperty(propertyName, newValue);
                     dataProperties.store(writer, null);
                     writer.close();
              } catch (IOException e) {
                     e.printStackTrace();
              }
              
       }

}
