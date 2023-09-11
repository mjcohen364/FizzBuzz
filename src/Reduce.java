public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;

        while (i != 0) {
            boolean even = i % 2 == 0;

            if (even) {
                i = i / 2;
            }
            else {
                i--;
            }
            count++;
        }
        System.out.println(count);
    }
}
