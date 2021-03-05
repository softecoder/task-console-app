import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    private static Scanner scanner;

    @BeforeAll
    static void setUp() {
        scanner = new Scanner(System.in);
    }

    @Test
    public void printAreaTest(){
        assertTrue(Runner.printArea(new Circle(),scanner));
    }

}