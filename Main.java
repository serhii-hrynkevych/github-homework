public class Main {

    public static void main(String[] args) {
        String line = "Hello, world!";
        System.out.println(line);
    }

    public static void print(String line) {
        System.out.println(line);
    }

    public static void print(String line, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(line);
        }
    }
}
