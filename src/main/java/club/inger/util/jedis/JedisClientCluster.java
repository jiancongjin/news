package club.inger.util.jedis;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by inger on 2019/4/18.
 */
public class JedisClientCluster implements JedisClient {
    public JedisClientCluster(){

        nodes.add(new HostAndPort("106.13.137.157", 7001));
        nodes.add(new HostAndPort("106.13.137.157", 7002));
        nodes.add(new HostAndPort("106.13.137.157", 7003));
        nodes.add(new HostAndPort("106.13.137.157", 7004));
        nodes.add(new HostAndPort("106.13.137.157", 7005));
        nodes.add(new HostAndPort("106.13.137.157", 7006));
        jedisCluster = new JedisCluster(nodes);
    }

    private  Set<HostAndPort> nodes = new HashSet<>();

    private  JedisCluster jedisCluster ;
   // private JedisCluster jedisCluster =  new redis.clients.jedis.JedisCluster();

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public Boolean exists(String key) {
        return jedisCluster.exists(key);
    }

    @Override
    public Long expire(String key, int seconds) {
        return jedisCluster.expire(key, seconds);
    }

    @Override
    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }

    @Override
    public Long incr(String key) {
        return jedisCluster.incr(key);
    }

    @Override
    public Long hset(String key, String field, String value) {
        return jedisCluster.hset(key, field, value);
    }

    @Override
    public String hget(String key, String field) {
        return jedisCluster.hget(key, field);
    }

    @Override
    public Long hdel(String key, String... field) {
        return jedisCluster.hdel(key, field);
    }

    @Override
    public void close() {
        try {
            jedisCluster.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Long lpush(String key, String value) {
        return jedisCluster.lpush(key,value);
    }

    @Override
    public List<String> lrange(String key, long start, long end) {
        return jedisCluster.lrange(key, start, end);
    }

    public void setJedisCluster(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    public static void main(String[] args) {
        JedisClientCluster jedisClientCluster = new JedisClientCluster();
        jedisClientCluster.set("test","test");
        System.out.println(jedisClientCluster.get("test"));
        jedisClientCluster.close();
    }
}
