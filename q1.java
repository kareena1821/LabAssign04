import java.util.*;
//Kareena 19105112
/*Write a java code to create user define size vector and store some values till user
wants or vector is not full and display vector elements. */
public class q1 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the vector : ");
        int sizeOfVector = sc.nextInt();
        Vector<Integer> storingVector = new Vector<Integer>(sizeOfVector);
    
        // Filling up the vector
        System.out.println("Enter the elements : ");
        for (int i = 0; i < sizeOfVector; i++) {
          int current = sc.nextInt();
          storingVector.addElement(current);
        }
        
    
        // Showing the contents of vector
        System.out.println("The values in the vector are : ");
        
        for (int i = 0; i < sizeOfVector; i++) {
          System.out.print(" " + storingVector.elementAt(i));
        }
        
        sc.close();
      }
    
    
       
    
}
    

