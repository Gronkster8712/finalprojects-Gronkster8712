import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class FinanceManager {
    private ArrayList<Transaction> history; // this will store all transactions
    private Stack<Transaction> undoStacl; //this will allow the ability to undo the previous transaction
    private HashMap<String, Double> categoryTotals; // this will store totals by category

    public FinanceManager() {
        history = new ArrayList<>();
        undoStack = new Stack<>();
        categoryTotals = new HashMap<>();
}

public void addTransaction(Transaction t) {
    history.add(t);
    undo.stack.push(t);
