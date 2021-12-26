import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
public class MainTest {

    @Test
    //тестовые данные 9, -1, 0, -9, 1
    public void testOne() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(9, -1, 0, -9, 1));
        String testData = TestClass.getNumbers(testList);
        String testDataStandart = "плюс девять;минус один;ноль;минус девять;плюс один";
        Assertions.assertArrayEquals(new String[]{testDataStandart}, new String[]{testData});
    }

    @Test
    //тестовые данные -10, -9, -8, 1, -7, 4
    public void testTwo() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(-10, -9, 9));
        String testData = TestClass.getNumbers(testList);
        String testDataStandart = "error";
        Assertions.assertArrayEquals(new String[]{testDataStandart}, new String[]{testData});
    }

    @Test
    //тестовые данные -8, 10, 9
    public void testThree() {;
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(-8, 10, 9));
        String testData = TestClass.getNumbers(testList);
        String testDataStandart = "error";
        Assertions.assertArrayEquals(new String[]{testDataStandart}, new String[]{testData});
    }

    @Test
    //тестовые данные -10,10
    public void testFour() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(-10, 10));
        String testData = TestClass.getNumbers(testList);
        String testDataStandart = "error";
        Assertions.assertArrayEquals(new String[]{testDataStandart}, new String[]{testData});
    }
}