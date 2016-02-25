package com.hdd.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置文件读取工具类
 * 
 * @author Administrator
 *
 */
public class PropertiesReadUtil {

    /**
     * 文件所在路径
     */
    private static final String CFG_FILE_NAME = "/customername.properties";

    private static InputStream is = PropertiesReadUtil.class.getClassLoader().getResourceAsStream(CFG_FILE_NAME);

    private static Properties prop;

    static {// 装载文件
        try {
            prop = new Properties();
            prop.load(is);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    /**
     * 根据propertyKey 获得 value
     * 
     * @param key
     * @return value
     */
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
