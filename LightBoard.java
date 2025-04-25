import java.util.ArrayList;

public class LightBoard
{
 /** The lights on the board, where true represents on and false represents off.
 */
   private boolean[][] lights;
   /** Constructs a LightBoard object having numRows rows and numCols columns.
    * Precondition: numRows > 0, numCols > 0
    * Postcondition: each light has a 40% probability of being set to on.
   */
   public LightBoard(int numRows, int numCols)
   { 
    /* to be implemented in part (a) */ 
      lights = new boolean [numRows][numCols];
      for(int row = 0; row < lights.length; row++)
      {
         for (int col = 0; col < numRows; col++)
         {
            double temp = Math.random() * 10;
            if(temp <= 4)
            {
               lights[row][col] = true;
            }
         }
      }
   }
 /** Evaluates a light in row index row and column index col and returns a status
 * as described in part (b).
 * Precondition: row and col are valid indexes in lights.
 */
   public boolean evaluateLight(int row, int col)
   {
      if(lights[row][col])
      {
         int temp1 = 0;
         for (int col1 = 0; col1 < lights.length; col1++)
         {
            if(lights[row][col1])
            {
               temp1++;
            }
         }

         if(temp1 % 2 != 0)
         {
            return (temp1 % 2 != 0);
         }else{
            return lights[row][col];
         }
      }else{
         int temp2 = 0;
         for (int col1 = 0; col1 < lights.length; col1++)
         {
            if(lights[row][col1])
            {
               temp2++;
            }
         }

         if(temp2 % 3 == 0)
         {
            return (temp2 % 3 == 0);
         }else{
            return lights[row][col];
         }
      } 
    /* to be implemented in part (b) */ 
   }
 // There may be additional instance variables, constructors, and methods not shown.
} 
