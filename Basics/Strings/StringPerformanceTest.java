package Strings;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (String): " + (end - start) + " ms");

        start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        end = System.currentTimeMillis();
        System.out.println("Time taken (StringBuilder): " + (end - start) + " ms");
    }
}
