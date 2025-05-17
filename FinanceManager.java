import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class FinanceManager {
    private ArrayList<Transaction> history; // this will store all transactions
    private Stack<Transaction> undoStack; //this will allow the ability to undo the previous transaction
    private HashMap<String, Double> categoryTotals; // this will store totals by category

    public FinanceManager() {
        history = new ArrayList<>();
        undoStack = new Stack<>();
        categoryTotals = new HashMap<>();
}

public void addTransaction(Transaction t) {
    history.add(t);
    undoStack.push(t);

    String category = t.getCategory();
    double amount = t.getAmount();

    if (t.getType().equalsIgnoreCase("income")) {
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amount);
    } else if (t.getType().equalsIgnoreCase("expense")) {
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) - amount);
    } //had some help from ChatGpt to assist me with this section of the code
}

public boolean undoTransaction() {
    if (!undoStack.isEmpty()) {
        Transaction last = undoStack.pop();
        history.remove(history.size() - 1);

    String category = last.getCategory();
    double amount = last.getAmount();

    if (last.getType().equalsIgnoreCase("income")) {
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) - amount)
     } else {
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amount)
            } //also used help from chatgpt for this section of code.
        return true;
    }
    return false;
}

public void printSummary() {
    System.out.println("----Financial Summary ----");
    for (String category : categoryTotals.keySet()) {
        System.out.printf("%s: $%.2f\n", category, categoryTotals.get(category));
    }
    System.out.println("--------------------------");
}

public void printHistory() {
    System.out.println("---- Transaction History ----");
    for (Transaction t : history) {
        System.out.println(t);
    }
    System.out.println("--------------------------");
}
}
