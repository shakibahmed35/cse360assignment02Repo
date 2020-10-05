package cse360assignment02;

/** This is the Adding Machine class. This class has one attribute. 
*   This class has methods including getTotal(), add(), subtract(),
*   toString(), and clear() 
*   @author Shakib Ahmed
*   @version 2.0
*   @since 2020-10-04
*/

public class AddingMachine {
  private int total;
  
  /** This method is the constructor and instantiates total to 0 */
  public AddingMachine () {
    this.total = 0;  // not needed - included for clarity
  }
  
  /** This method returns the current value of total
   * @return int total returns the current total value of the object
  */
  public int getTotal () {
    return total;
  }
  
  /** This method adds a value to the total and updates the history
   * @param value This is the number added to the total
   * @return nothing
  */
  public void add (int value) {
  }

  /** This method subtracts a value from the total and updates the history
   * @param value This is the number subtracted to the total
   * @return nothing
  */
  public void subtract (int value) {
  }
  
  /** This method displays the history 
   * @return String This is a string representation of the object
  */
  public String toString () {
    return "";
  }

  /** This method clears the history to being an empty string
   * @return nothing
   */
  public void clear() {
  }
}