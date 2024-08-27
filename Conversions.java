import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Fluid Ounces to Milliliters");
        System.out.println("6. Milliliters to Fluid Ounces");
        System.out.println("7. Miles to Kilometers");
        System.out.println("8. Kilometers to Miles");
        System.out.println("9. Pounds to Kilograms");
        System.out.println("10. Kilograms to Pounds");
        
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.
        
        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input
        
        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double Fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (Fahrenheit - 32)*5.0/9.0;
            System.out.println(Fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }//add the code to ask the user to enter Fahrenheit and then convert to Celsius
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*0.3048;
            System.out.println(feet + " feet is equal to" + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters*3.28084;
            System.out.println(meters + " meters is equal to" + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Fluid Ounces: ");
            double fluidOunces = keyboard.nextDouble();
            keyboard.nextLine();
            double mililiters = fluidOunces*29.5735;
            System.out.println(fluidOunces + " Fluid Ounces is equal to " + mililiters + " mililiters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Mililiters: ");
            double mililiters = keyboard.nextDouble();
            keyboard.nextLine();
            double fluidOunces = mililiters*0.033814;
            System.out.println(mililiters + " Mililiters is equal to " + fluidOunces + " fluid ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = miles*1.60934;
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
        }
        if (selection == 8)
        {
            System.out.println("Enter Kilometers: ");
            double kilometer = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = kilometer*0.621371;
            System.out.println(kilometer + " kilometers is equal to " + miles + " miles");
        }
        if (selection == 9)
        {
            System.out.println("Enter Pounds: ");
            double pounds = keyboard.nextDouble();
            keyboard.nextLine();
            double kilograms = pounds*0.453592;
            System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
        }
        if (selection == 10)
        {
            System.out.println("Enter Kilograms: ");
            double kilograms = keyboard.nextDouble();
            keyboard.nextLine();
            double pounds = kilograms*2.20462;
            System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds");
        }
    }
}