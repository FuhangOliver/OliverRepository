package test.JunitTest;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import test.IoExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ResdisTest {

    //访问redis数据库
    @Test
    public void test1() {
        //获得连接对象
        Jedis jedis = new Jedis("192.168.14.129", 6379);
        //取数据
        String fuhang = jedis.get("fuhang");
        System.out.println(fuhang);
        //存数据
        jedis.set("addr", "武汉");
        System.out.println(jedis.get("addr"));
    }

    //jedispool获得jedis连接对象
    @Test
    public void test2() {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(30);
        poolConfig.setMinIdle(10);
        poolConfig.setMaxTotal(50);
        //创建连接池
        JedisPool jedisPool = new JedisPool(poolConfig, "192.168.14.129", 6379);
        //获取资源
        Jedis jedis = jedisPool.getResource();
        //操作数据库
        jedis.set("xxxxx", "yyyyyy");
        System.out.println(jedis.get("xxxxx"));
        //关闭连接
        jedis.close();
        jedisPool.close();

    }

    //jedispool获得jedis连接对象
    @Test
    public void test3() throws IOException {
        //获得配置文件
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src\\main\\resources\\redis.properties");
        prop.load(fis);

        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(Integer.parseInt(prop.get("redis.pool.maxIdle").toString()));
        poolConfig.setMinIdle(Integer.parseInt(prop.get("redis.pool.minIdle").toString()));
        poolConfig.setMaxTotal(Integer.parseInt(prop.get("redis.pool.maxTotal").toString()));
        //创建连接池
        JedisPool jedisPool = new JedisPool(poolConfig, prop.get("redis.host").toString(), Integer.parseInt(prop.get("redis.port").toString()));
        //获取资源
        Jedis jedis = jedisPool.getResource();
        //操作数据库
        jedis.set("wulanlan", "1206");
        System.out.println(jedis.get("wulanlan"));
        //关闭连接
        jedis.close();
        jedisPool.close();

    }
}
