
public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void testAdd() {
        if (add(1, 2) != 3) {
            throw new AssertionError("Test failed: add(1, 2)");
        }

        if (add(1, -1) != 0) {
            throw new AssertionError("Test failed: add(1, -1)");
        }

        System.out.println("All tests passed!");
    }

    public static void main(String[] args) {
        testAdd();
    }
}
