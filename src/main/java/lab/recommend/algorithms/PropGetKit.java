/**
 * 
 */
package lab.recommend.algorithms;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 310Lab
 * @email 983233165@qq.com
 * @github https://github.com/jiancongjin
 * @date 2019年4月30日 用以读取配置文件，获取对应属性
 */
public class PropGetKit
{
	private static final Logger logger = Logger.getLogger(PropGetKit.class);

	public static Properties propGetKit = new Properties();

	public static void loadProperties(String configFileName)
	{
		try
		{
			System.out.println("G:\\框架学习\\news\\res\\" + configFileName + ".properties");
			//propGetKit.load(new FileInputStream("G:\\框架学习\\news\\res\\" + configFileName + ".properties"));
			propGetKit.load(PropGetKit.class.getClassLoader().getResourceAsStream("paraConfig.properties"));
			//propGetKit.load(new FileInputStream(new File(String.valueOf(Thread.currentThread().getContextClassLoader().getResource("paraConfig.properties")))));
		}
		catch (FileNotFoundException e)
		{
			logger.error("读取属性文件--->失败！- 原因：文件路径错误或者文件不存在");
		}
		catch (IOException e)
		{
			logger.error("装载文件--->失败!");
		}
	}

	public static String getString(String key)
	{
		return propGetKit.getProperty(key);
	}
	
	public static int getInt(String key)
	{
		return Integer.valueOf(propGetKit.getProperty(key));
	}
	
}
