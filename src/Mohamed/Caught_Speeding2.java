package Mohamed;

public class Caught_Speeding2 {
    public static void main(String[] args) {
        int result=0;
        int speed=90;
        boolean birthday=true;
        //Variables to low and high speed limit:
        int lowSpeed= birthday ? 65:60;
        int highSpeed=birthday ? 85:80;
        if(speed<=lowSpeed){
            System.out.println("No ticket");
            result=0;
        }else if(speed>lowSpeed && speed<=highSpeed){
            System.out.println("Small ticket");
        }else{
            System.out.println("Big ticket");
        }
        System.out.println("Result"+result);



    }
}
