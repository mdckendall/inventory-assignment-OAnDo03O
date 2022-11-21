import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
// Assigning Values
  String name, serialNum;
  int value;
// Getter
  public Inventory (String name, String serialNum, int value) {
    this.name = name;
    this.serialNum = serialNum;
    this.value = value;
  } 
// Print Values
  public String print() {
    return this.name + "," + this.serialNum + "," + this.value;
  }
}

class Main {
	public static void main(String[] args) {
  // Assigning Values
    Scanner scan = new Scanner(System.in);
    int input = 0;
    ArrayList<Inventory> inventory = new ArrayList<Inventory>();
    String name, serialNum;
    int value;
    
  // First Loop Output
    System.out.println("Press 1 to add an item.\n" +
                       "Press 2 to delete an item.\n" +
                       "Press 3 to update an item.\n" +
                       "Press 4 to show all the items.\n" +
                       "Press 5 to quit the program.");
    input = scan.nextInt();
    
  // While Loop
    while (input != 5) {
    // Switch Case
      switch (input) {
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        case 1:
        // Ignore Next Line
          scan.nextLine();
        // Output
          System.out.println("Enter the name:");
        // Input
          name = scan.nextLine();
        // Output
          System.out.println("Enter the serial number:");
        // Input
          serialNum = scan.nextLine();
        // Output
          System.out.println("Enter the value in dollars (whole number):");
        // Input
          value = scan.nextInt();
        // Saving
          inventory.add(new Inventory(name, serialNum, value));
          break;
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

        case 2:
        // Ignore Next Line
          scan.nextLine();
        // Output
          System.out.println("Enter the serial number of the item to delete:");
        // Input
          serialNum = scan.nextLine();
        // For List Loop
          for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).serialNum.equals(serialNum)) 
            { inventory.remove(inventory.get(i)); }
          }
          break;
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        case 3:
        // Ignore Next Line
          scan.nextLine();
        // Output
          System.out.println("Enter the serial number of the item to change:");
        // Input
          serialNum = scan.nextLine();
        // For List Loop
          int update = 0;
          for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).serialNum.equals(serialNum)) 
              { update = i; }
          }
        // Output
          System.out.println("Enter the new name:");
        // Input
          inventory.get(update).name = scan.nextLine();
        // Output
          System.out.println("Enter the new value in dollars (whole number):");
        // Input
          inventory.get(update).value = scan.nextInt();
          break;
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
        case 4:
        // Output
          for (Inventory i : inventory) {
            System.out.println(i.print());
          }
          break;
      }
      
    // Output
      System.out.println("Press 1 to add an item.\n" +
                         "Press 2 to delete an item.\n" +
                         "Press 3 to update an item.\n" +
                         "Press 4 to show all the items.\n" +
                         "Press 5 to quit the program.");
    // New Input
      input = scan.nextInt();
    }
	}
}