package part02.detail.practice08.collectionmethods;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Theory4_maps_anEmptyMap_etc {
    @Test
    public void test1() {
        Map<String, Integer> inventory = new HashMap<>();
        assertThat(inventory, anEmptyMap());
        assertThat(inventory, aMapWithSize(0));

        inventory.put("shoes", 4);
        inventory.put("sneakers", 5);
        inventory.put("shirts", 10);

        assertThat(inventory, hasKey("shoes"));
        assertThat(inventory, hasValue(5));
        assertThat(inventory, hasEntry("shoes", 4));
    }
}
