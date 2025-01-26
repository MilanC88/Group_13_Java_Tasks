package Mohamed;

public class CaughtSpeeding {
    public static void main(String[] args) {
        int result=0;
        int speed=85;
        boolean birthday=true;
     if(speed<=60||(birthday&&speed<=65)){
         System.out.println("No ticket");
         result=0;
     }else if(speed>60&&speed<=80||speed>65&&speed<=85&&birthday){
         System.out.println("small ticket");
         result=1;
     }else {
         System.out.println("Big ticket");
         result=2;
     }
        System.out.println("Result: "+result);


    }}
