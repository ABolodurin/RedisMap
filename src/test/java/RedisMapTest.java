import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RedisMapTest {
    private RedisMap redisMap;

    @BeforeEach
    void init() {
        redisMap = new RedisMap();
    }

    @Test
    void getAndPutShouldWork() {
        String key = "key";
        String expectedValue = "expectedValue";

        redisMap.put(key,expectedValue);

        String actualValue = redisMap.get(key);
        assertEquals(actualValue, expectedValue);

        String actualReturn = redisMap.put(key, "whatever");
        assertEquals(actualReturn, expectedValue);
    }

}
