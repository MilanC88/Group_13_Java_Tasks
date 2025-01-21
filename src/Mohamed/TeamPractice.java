package Mohamed;

public class TeamPractice {
    public static void main(String[] args) {
    finra();
    }
    public static void finra(){
        for (int i = 1; i < 31; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("Finra ");
            } else if (i % 5 == 0) {
                System.out.print("Ra ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print(i + " ");
            }

        }
    }



}
