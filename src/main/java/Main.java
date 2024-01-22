import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RedisMap map = new RedisMap();
        String what = map.put("one", "two");
        what = map.put("one", "four");
        System.out.println(what);
    }
}
