import javax.swing.*;
public class SortedArray
{
   private int next;
   private int size;
   private String inputString;
   private StudentListing[] data;
   public SortedArray ()
   {
      next = 0;
      inputString = JOptionPane.showInputDialog("Enter data set size");
         size = Integer.parseInt(inputString);
      data = new StudentListing[size];
   }
   public SortedArray (int s)
   {
      next = 0;
      data = new StudentListing[s];
      size = s;
   }
   public boolean insert (StudentListing newSL)
   {
      if(next >= size)
         return false;
      data[next] = newSL.deepCopy();
      
      if(data[next] == null)
         return false;
      next = next+1;
      return true;
   } // end of insert method
    public StudentListing fetch (String targetKey)
    {
      StudentListing student;
      StudentListing temp;
      int i = 0;
      while(i < next && !(data[i].compareTo(targetKey) == 0))
      {
         i++;
      }
      if (i == next)
         return null;
      student = data[i].deepCopy();
      if(i !=0)
      {
         temp = data[i-1];
         data[i-1] = data[i];
         data[i] = temp;
      }
         return student;
    } // end of fetch method
    
    public boolean delete(String targetKey)
    {
      int i= 0;
      while(i < next && !(data[i].compareTo(targetKey) == 0))
      {
         i++;
      }
      if (i == next)
         return false;
      data[i] = data[next-1];
      data[next-1] = null;
      next = next -1;
      return true;
    }//end of delete method
    
    public boolean update(String targetKey, StudentListing newSL)
    {
      if(delete(targetKey) == false)
         return false;
      else if(insert(newSL) == false)
         return false;
      else
         return true;
    } // end of update method
    public void showAll()
    {
      for(int i = 0; i < next; i++)
      System.out.println(data[i].toString());
    } // end of showAll method
}
