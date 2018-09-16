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

         SortedArray abcCollege = new SortedArray();
         /*StudentListing [] studentList = new StudentListing[STU_SIZE];
            for(i=0; i<STU_SIZE; ++i) // For loop adds values to the members of the array
           {
              studentList[i] = new StudentListing();
              studentList[i].input(); //allows user to input array member information
           }*/
           inputString = JOptionPane.showInputDialog("Please select an option from the following menu: \n1. Insert a new student's information" +
            "\n2. Fetch and Output a students information " + "\n 3.Delete a student's information" + "\n4. Update a student's information " +
            "\n5. Output all student information in a sorted order " + "\n6. Exit the program");
         option = Integer.parseInt(inputString);
        if (option == 1)
        {
         StudentListing myData = new StudentListing();
         System.out.println(abcCollege.insert(myData));
        }
        else if (option == 2)
        {
         String name = JOptionPane.showInputDialog("Who are you looking for?");
         System.out.println(abcCollege.fetch(name));
        }
        else if (option == 3)
        {
         String remove = JOptionPane.showInputDialog("Who would you like to remove?");
         abcCollege.delete(remove);
        }
        else if (option == 4)
        {
         String newInfo = JOptionPane.showInputDialog("Who would you like to add?");
         StudentListing updateInfo = new StudentListing();
         abcCollege.update(newInfo, updateInfo);
        }
        else if (option == 5)
        {
         abcCollege.showAll();
        }
        else
        {
         System.exit(0);
        }
      }
}
