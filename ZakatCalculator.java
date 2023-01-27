/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc;
import java.util.Scanner;
public class ZakatCalculator {
    public static void main(String args[]){
    int Gold, Investment, Property, GoldValue, TotalAmount, Zakat;
    Scanner in = new Scanner(System.in);
    //Gold
    System.out.println("Enter the amount of gold you have in tola: ");
    Gold = in.nextInt();
    GoldValue = Gold*107000;
    System.out.println("The value of your gold is: " + GoldValue +"RS");
    //Investment
    System.out.println("Enter the amount of investment you have done in any place (if no then simplly put 0): ");
    Investment = in.nextInt();
    //Property
    System.out.println("Enter the value of your property that you have for commercial use(If you don't have any property for commercial use then simplly put 0): ");
    Property = in.nextInt();
    TotalAmount= Investment + Property + GoldValue;
    Zakat = TotalAmount/40;
    if (TotalAmount >= 802500){
        System.out.println("Your total amount is: "+ TotalAmount);
        System.out.println("Your Zakat is: "+ Zakat);
    }
    else {
        System.out.println("You don't have amount equal to the value of 7.5 tola Gold so you don't have to pay Zakat.");
    }
    }
}