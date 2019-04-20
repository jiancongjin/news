package test.test;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by inger on 2019/4/20.
 */
public class ConfigTest {
    public static void main(String[] args) throws IOException {
        Properties propGetKit = new Properties();
        propGetKit.load(ConfigTest.class.getClassLoader().getResourceAsStream("dbconfig.properties"));
        System.out.println(propGetKit.getProperty("url"));
    }
}
