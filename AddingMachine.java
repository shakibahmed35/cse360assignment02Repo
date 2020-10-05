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
  private String history;
  
  /** This method is the constructor and instantiates total to 0 */
  public AddingMachine () {
    this.total = 0;  // not needed - included for clarity
    this.history = "0";
  }
  
  /** This method returns the current value of total
   * @return int total returns the current total value of the object
  */
  public int getTotal () {
    return this.total;
  }
  
  /** This method adds a value to the total and updates the history
   * @param value This is the number added to the total
   * @return nothing
  */
  public void add (int value) {
    this.total = this.total + value;
    this.history = this.history + " + " + value;
  }

  /** This method subtracts a value from the total and updates the history
   * @param value This is the number subtracted to the total
   * @return nothing
  */
  public void subtract (int value) {
    this.total = this.total - value;
    this.history = this.history + " - " + value;
  }
  
  /** This method displays the history 
   * @return String This is a string representation of the object
  */
  public String toString () {
    return this.history;
  }

  /** This method clears the history to being an empty string
   * @return nothing
   */
  public void clear() {
    this.total = 0;
    this.history = "0";
  }
}