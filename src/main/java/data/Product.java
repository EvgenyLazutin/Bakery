package data;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public enum Product {

    VS5(new TreeMap<Integer, Double>(Collections.reverseOrder()) {{
        put(5, 8.99);
        put(3, 6.99);
    }}),
    MB11(new TreeMap<Integer, Double>(Collections.reverseOrder()) {{
        put(2, 9.95);
        put(5, 16.95);
        put(8, 24.95);
    }}),
    CF(new TreeMap<Integer, Double>(Collections.reverseOrder()) {{
        put(3, 5.95);
        put(5, 9.95);
        put(9, 16.99);
    }});

    private final Map<Integer, Double> pack;

    Product(Map<Integer, Double> pack) {
        this.pack = pack;
    }

    public Map<Integer, Double> getPack() {
        return pack;
    }
}

