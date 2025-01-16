package Mohamed;

public class Finra {

     /*Write a function which prints out the numbers from 1 to 30 but
     the numbers that are a multiple of 3, print "Fin" instead of the number. and for
     numbers which are multiply by 5, print "Ra" instead of the number.
    for the numbers which are a multiple of both 3 and 5, print "Finra" instead of the number.
*/
    public static void main(String[] args) {

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


