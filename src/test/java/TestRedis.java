import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2024/2/24
 */
@ContextConfiguration("classpath:redis.xml")
public class TestRedis extends AbstractJUnit4SpringContextTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testConn() {
        redisTemplate.opsForValue().set("name-s", "Jordan");
        System.out.println(redisTemplate.opsForValue().get("name-s"));
    }

}
