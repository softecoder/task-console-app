import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RunnerTest {

    private static Scanner mockScanner;
    private static Shape mockShape;

    @BeforeAll
    static void setUp() {
        mockScanner = mock(Scanner.class);
        mockShape = mock(Shape.class);
    }

    @Test
    public void printAreaTest() {
        when(mockScanner.nextInt()).thenReturn(0);
        assertTrue(Runner.printArea(new Circle(), mockScanner));
    }

    @Test
    public void initShapeParametersTest() {
        Circle shape = new Circle();
        shape.setRadius(5);
        when(mockScanner.nextInt()).thenReturn(5);
        assertEquals(Runner.initShapeParameters(mockShape, mockScanner), shape);
    }

    @Test
    public void inputShapeTypeTest() {
        when(mockScanner.nextInt()).thenReturn(1);
        assertTrue(Runner.initShapeParameters(mockShape, mockScanner) instanceof Circle);
    }
}