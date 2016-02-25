package com.hdd.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * Created by liuh on 2016/2/19.
 */
public class PropertiesUtil {



    public static List getProperty() throws IOException {



        String filename = "customername.properties";
        InputStream in = Object.class.getResourceAsStream(filename);
        //File fileB = new File( PropertiesUtil.class.getClass().getResource( "" ).getPath());
        Properties props = new Properties();
        props.load(in);
        String h = props.getProperty("v");
        Enumeration enumeration = props.propertyNames();

        System.out.println("enumeration："+enumeration);
        return null;
    }

}
