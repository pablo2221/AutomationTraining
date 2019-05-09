package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Reader {

    Properties props = new Properties();

    public String readProperty (String key){


        String result= "";
        try{

            props.load(new FileInputStream("config.properties"));
            result= props.getProperty(key);

        }catch (Exception e){

            System.out.println("No se pudo leer la propiedad");

        }

        return result;
    }

    public void writeProperty (String key, String value){

        try{

            props.setProperty(key, value);
            props.store(new FileOutputStream("config.properties"),  null);

        } catch(Exception e){

            System.out.println(e.getMessage());

        }
    }
}
