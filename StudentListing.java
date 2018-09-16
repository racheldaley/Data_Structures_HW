import javax.swing.*;
public class StudentListing
{
   private String name;
   private String idnumber;
   private String gpa;
   public StudentListing ()
   {
   }
   public StudentListing(String n, String i, String g)
   {
      name = n;
      idnumber = i;
      gpa = g;
   }
   public String toString()
   {  return ("Name is " + name +
               "\nID number is " + idnumber +
               "\nGPA is " + gpa + "\n");
   }
   public StudentListing deepCopy()
   {  StudentListing clone = new StudentListing(name, idnumber, gpa);
      return clone;
   }
   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }
   public void setName(String n)
   {
      name = n;
   }
   public void setIDNumber (String i)
   {
      idnumber = i;
   }
   public void setGPA (String g)
   {
      gpa = g;
   }
   public String getName()
   {
      return name;
   }
   public String getIDNumber()
   {
      return idnumber;
   }
   public String getGPA()
   {
      return gpa;
   }
   public void input()
   {
      name = JOptionPane.showInputDialog("Enter a name");
      idnumber = JOptionPane.showInputDialog("Enter an ID number");
      gpa = JOptionPane.showInputDialog("Enter a GPA");
   }
}
