package club.inger.listener;

import lab.recommend.algorithms.PropGetKit;
import lab.recommend.dbconnection.DBKit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by inger on 2019/4/14.
 */
public class InitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("启动容器");
        PropGetKit.loadProperties("paraConfig");
        DBKit.initalize();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
