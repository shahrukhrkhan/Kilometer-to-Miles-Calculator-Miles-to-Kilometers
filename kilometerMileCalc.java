import javax.swing.JOptionPane;
import java.util.Scanner;

   public class kilometerMileCalc{
   //Main method
      public static void main(String[] args){
         //variable declarations
         String answer;
         double km;
         //Ask user which conversion they prefer
         answer = JOptionPane.showInputDialog(null, "Convert to Miles or Kilometers? "+ "1=Miles, 2=Kilometers");
         int answerOne = Integer.parseInt(answer);
       //if statement to call method depending on which conversion user picked
       if ( answerOne <= 1)
       {
         calcMiles();
       }
       else if (answerOne > 1)
       {
         calcKms();
       }
     }
   //public method to calculate miles from kilometers
   public static double calcMiles(){
      String answer;
      answer = JOptionPane.showInputDialog(null, "Enter Kilometers: ");
      double answerOne = Double.parseDouble(answer);
      
      double km = answerOne;
      double miles = km *.6214;
      JOptionPane.showMessageDialog(null,
      String.format( "The converted amount from Kilometers to Miles is:%,.2f",miles));
     
      return km;
   }
   //public method to calculate kilometers from miles
    public static double calcKms(){
      String answer;
      answer = JOptionPane.showInputDialog(null, "Enter Miles: ");
      double answerOne = Double.parseDouble(answer);
      
      double miles = answerOne;
      double km = miles / .6214;
      JOptionPane.showMessageDialog(null,
      String.format( "The converted amount from Miles to Kilometers is:%,.2f",km));      
      
      return km;
   }
   
}