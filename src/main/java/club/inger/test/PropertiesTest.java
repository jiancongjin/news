package club.inger.test;

import lab.recommend.algorithms.PropGetKit;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by inger on 2019/4/12.
 */
public class PropertiesTest {
    private static final Logger logger = Logger.getLogger(PropGetKit.class);

    public static Properties propGetKit = new Properties();

    public static void main(String[] args) {

            try {
                //System.out.println(System.getProperty("user.dir") + "/res/" + configFileName + ".properties");
                propGetKit.load(new FileInputStream("G:\\框架学习\\news\\res\\" + "paraConfig" + ".properties"));
                System.out.println("-----------------");
            } catch (FileNotFoundException e) {
                logger.error("读取属性文件--->失败！- 原因：文件路径错误或者文件不存在");
            } catch (IOException e) {
                logger.error("装载文件--->失败!");
            }
    }
}

