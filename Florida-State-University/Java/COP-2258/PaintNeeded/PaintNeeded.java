import java.util.Scanner;
import java.lang.Math;

public class PaintNeeded {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
   
    double wallHeight;
    double wallWidth;
    double wallArea;
    double paintCost;
    double paintNeeded;
    final double gallonPaint;
    final double cansNeeded;
    double salesTax;
    double totalCost;
    
   wallHeight = scnr.nextDouble();
   wallWidth = scnr.nextDouble();
   wallArea =  wallHeight * wallWidth;
   paintCost = scnr.nextDouble();
   gallonPaint = 350;0
   paintNeeded = wallArea / gallonPaint;
   cansNeeded = gallonPaint / paintNeeded; 
   salesTax = paintCost * 0.07;
   totalCost = paintCost + salesTax;
   
   System.out.printf("Wall area: %.1f sq ft\n", wallArea);
   System.out.printf("Paint needed: %.3f gallons\n", paintNeeded);
   System.out.printf("Cans needed: " +  ((int)Math.ceil(cansNeeded / 100)) + " can(s)\n");
   System.out.printf("Paint cost: $%.2f\n", paintCost);
   System.out.printf("Sales tax: $%.2f\n", salesTax);
   System.out.printf("Total cost: $%.2f\n",  totalCost);
   }
}
