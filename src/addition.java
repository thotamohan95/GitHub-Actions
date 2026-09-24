public class App {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void testAdd() {
        assert add(1, 2) == 3;
        assert add(1, -1) == 0;
    }

    public static void main(String[] args) {
        testAdd();
        System.out.println("All tests passed!");
    }
}
