import javax.swing.*;
public class StudentInformation
{
   public static void main(String[] args)
   {
   int i; 
   String inputString;
   inputString = JOptionPane.showInputDialog("Please enter intial number of students");
   final int STU_SIZE = Integer.parseInt(inputString);
   int option;

   SortedArray[] abcCollege = new SortedArray[STU_SIZE];
            for(i=0; i<STU_SIZE; ++i) // For loop adds values to the members of the array
           {
              abcCollege[i] = new SortedArray();
              abcCollege[i].input(); //allows user to input array member information
           }
         inputString = JOptionPane.showInputDialog("Please select an option from the following menu: \n1. Insert a new student's information" +
            "\n2. Fetch and Output a students information " + "\n 3.Delete a student's information" + "\n4. Update a student's information " +
            "\n5. Output all student information in a sorted order " + "\6. Exit the program");
         option = Integer.parseInt(inputString);
        if (option == 1)
        {
         abcCollege.insert();
        }
        else if (option == 2)
        {
         abcCollege[i].fetch();
        }
        else if (option == 3)
        {
         abcCollege[i].delete();
        }
        else if (option == 4)
        {
         abcCollege[i].update();
        }
        else if (option == 5)
        {
         abcCollege[i].showAll();
        }
        else
        {
         System.exit(0);
        }
      }
}
