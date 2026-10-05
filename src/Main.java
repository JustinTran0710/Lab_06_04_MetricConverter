import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declarations
        double meters = 0;
        double miles  ;
        double feet;
        double inches;
        String trash = "";

        System.out.println("How long is your thing in meters?");

        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            in.nextLine();
        }
        else
        {
           trash = in.nextLine();
           System.out.println("Your Input is Invalid, Try again.");
           System.exit(0);
        }
        miles = meters / 1609.344;
        feet = meters * 3.28084;
        inches = meters * 39.3701;

        System.out.println("Your Item that is "+meters+" meters \nIn Miles: "+miles);
        System.out.println("In Feet: "+feet+"ft");
        System.out.println("In Inches: "+inches+"in");



    }


}