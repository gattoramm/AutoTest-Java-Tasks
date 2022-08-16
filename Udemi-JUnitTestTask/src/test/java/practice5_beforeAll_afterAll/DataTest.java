package practice5_beforeAll_afterAll;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import java.util.*;
import java.net.URL;
import java.io.*;
import java.util.ArrayList;


public class DataTest {
    static ArrayList<Integer> numbersList;
    static URL path;
    static File file;
    static Scanner scanner;

    @BeforeClass
    public static void init() throws FileNotFoundException {
        numbersList = new ArrayList();
        path = DataTest.class.getResource("numbers.txt");
        file = new File(path.getFile());
        scanner = new Scanner(file);

        while (scanner.hasNext()) {
            Integer i = Integer.parseInt(scanner.next());
            numbersList.add(i);
        }
    }

    @Test
    public void testFindLargest() {
        int computedValue = Data.findLargest(numbersList);
        int expectedValue = 40;
        assertEquals(computedValue, expectedValue);
    }

    @AfterClass
    public static void tearDown() {
        scanner.close();
    }
}
