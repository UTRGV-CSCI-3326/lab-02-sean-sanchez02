public class MixMatch {
    public static void main(String[] arg) {
        int number = 7;
        String name = "size";
        char grade = 'A';
        short max = 32000;
        long min = -500000000;
        float decimals = 7.3f;
        boolean green = true;
        double pi = 3.14159;

        System.out.println("integer, a value between -2^31 and 2^(31)-1 : " + number + "  String, a random word/words: " + name + "  char, a character or ascii value: " + grade + "  short, a value between -32,768 and +32,767: " + max + "  long, a value between -2^63 and 2^(63) -1: " + min + "  boolean, only true or false: " + green + "  double, a floating point between +-1.7 * 10^-308 and +-1.7 * 10^308, and can have 15 decimal places : " + pi + "  float, a floating point between +-3.4 8 10^-38 and +-3.4 * 10^38, and has 7 decimal places: " + decimals);

    }
}
