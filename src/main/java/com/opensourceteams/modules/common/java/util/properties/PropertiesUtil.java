package com.opensourceteams.modules.common.java.util.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


/**
 * 日期: 2016-03-24  20:48
 * 开发人:刘文  -->  (372065525@qq.com)
 * 功能描述:
 */
public class PropertiesUtil {


    /**
     * 属性文件 key 得到 value
     * @param filePath
     * @param key
     * @return
     */
    public static String getValueByKey(String filePath,String key){
        Properties p = new Properties();
        FileInputStream fileInputStream = null;
        try {
             fileInputStream = new FileInputStream(filePath);
             p.load(fileInputStream);
             return p.getProperty(key);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 得到属性文件
     * @param filePath
     * @return
     */
    public static Properties getProperties(String filePath){
        Properties p = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            p.load(fileInputStream);
            return p;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 过滤属性值
     * @param filePath
     * @param prefix
     * @return
     */
    public static Map<String,String> getPropertiesPrefix(String filePath,String prefix){
        Map<String,String> map = new HashMap<String, String>();
        Properties p = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            p.load(fileInputStream);

            Iterator it = p.keySet().iterator();


            if(it.hasNext()){
                Object obj = it.next();
                if(obj != null && obj.toString().contains(prefix)){
                    map.put(obj.toString(),p.getProperty(obj.toString()));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static Map<String,String> getPropertiesPrefix(Properties p,String prefix){
        Map<String,String> map = new HashMap<String, String>();

            Iterator it = p.keySet().iterator();


            while (it.hasNext()){
                Object obj = it.next();
                if(obj != null && obj.toString().contains(prefix)){
                    map.put(obj.toString(),p.getProperty(obj.toString()));
                }
            }
        return map;
    }
}
