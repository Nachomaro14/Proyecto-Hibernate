package factory;

import java.io.FileInputStream;
import java.util.Properties;

public class MyFactory {
    
    public Object getObject(String name){
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("src/factory/Properties.properties");
            Properties props = new Properties();
            props.load(fis);
            String sClazz = props.getProperty(name);
            return Class.forName(sClazz).newInstance();
        }
        catch(Exception ex){
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }finally{
            try{
                if( fis!=null ) fis.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
    }
}