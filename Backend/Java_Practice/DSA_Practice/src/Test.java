import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Test{

    public Test(){}
    @Test
    public void testFilterEvenNumbers() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> numberList = Arrays.asList(numbers);
        List<Integer> evenNumbers = numberList.stream()
                . filter(numbers -> numbers % 2 == 0)
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), evenNumbers);
    }
}