package test;

import club.inger.entity.Comment;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by inger on 2019/4/16.
 */
public class JedisTest {
    @Test
    public void testJedis() throws Exception {
        // 第一步：创建一个Jedis对象。需要指定服务端的ip及端口。
        Jedis jedis = new Jedis("106.13.137.157", 6379);
        jedis.set("hello","hello");
        // 第二步：使用Jedis对象操作数据库，每个redis命令对应一个方法。
        String result = jedis.get("hello");
        // 第三步：打印结果。
        System.out.println(result);
        // 第四步：关闭Jedis
        jedis.close();
    }
    @Test
    public void testJedisCluster() throws Exception {
        // 第一步：使用JedisCluster对象。需要一个Set<HostAndPort>参数。Redis节点的列表。
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("106.13.137.157", 7001));
        nodes.add(new HostAndPort("106.13.137.157", 7002));
        nodes.add(new HostAndPort("106.13.137.157", 7003));
        nodes.add(new HostAndPort("106.13.137.157", 7004));
        nodes.add(new HostAndPort("106.13.137.157", 7005));
        nodes.add(new HostAndPort("106.13.137.157", 7006));
        JedisCluster jedisCluster = new JedisCluster(nodes);
        // 第二步：直接使用JedisCluster对象操作redis。在系统中单例存在。
        jedisCluster.set("hello", "100");
        String result = jedisCluster.get("hello");
        Comment comment1 = new Comment("comment","news","user");
        Comment comment2 = new Comment("comment1","news1","user1");
        String json1 = JSON.toJSONString(comment1);
        String json2 = JSON.toJSONString(comment2);
        jedisCluster.del("comment");
       // jedisCluster.lr
        String comment = "comment";
       // jedisCluster.del(comment);
        jedisCluster.lpush(comment,json1);
        jedisCluster.lpush(comment,json2);
        System.out.println(jedisCluster.lrange(comment,0L,-1L));
        // 第三步：打印结果
        System.out.println(result);
        // 第四步：系统关闭前，关闭JedisCluster对象。
        jedisCluster.close();
    }
}
