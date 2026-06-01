package app;

import java.util.HashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Олівія");
        map.put(5, "Олександр");
        map.put(172, "Дмитро");
        map.put(10, "Анна");
        return map;
    }
}

