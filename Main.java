import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    FinanceManager manager = new FinanceManager();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("\n1. Add Transaction");
      System.out.println("2. Undo Last Transaction");
      System.out.println("3. View Summary");
      System.out.println("4. View History")
      System.out.println("5. Exit");
      System.out.print("Select option: ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice0 {
        case 1:
          System.out.print("Enter type (income/expense): ";
          String type = scanner.nextLine();
          System.out.print("Enter category (Food, Rent, Entertainment): ";
          String category = scanner.nextLine();
          System.out.print("Enter amount: ");
          double amount = scanner.nextDouble();
          scanner.nextLine();

          Transaction t = new Transaction(type, category, amount);
          manager.addTransaction(t);
          System.out.println("Transaction added.");
          break;
        case 2:
          if (manager.undoTransaction()) {
            System.out.println("Last transaction undone.");
          } else {
              System.out.print("No tansactios to undo.");
          }
          break;
        case 3:
          manager.printSummary();
          break;
        case 4:
          manager.printHistory();
          break;
        case 5:
          running = false;
          System.out.println("Goodbye");
          break;
        default:
          System.out.println("Invalid option")
            }
    }
    scanner.close();
  }
}
