public class Kata_EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(EvenOrOdd.even_or_odd(5));
        System.out.println(EvenOrOdd.even_or_odd(6));
    }

}

class EvenOrOdd {
    public static String even_or_odd(int number) {
        return number%2 == 0 ? "Even" : "Odd";
    }
}