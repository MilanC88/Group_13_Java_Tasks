package Mohamed;

public class FinraChat {
    public class Main {
        public static void main(String[] args) {
            printNumbers();
        }

        public static void printNumbers() {
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("Finra");
                } else if (i % 3 == 0) {
                    System.out.println("Fin");
                } else if (i % 5 == 0) {
                    System.out.println("Ra");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
