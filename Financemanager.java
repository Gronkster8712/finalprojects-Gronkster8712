import java.util;

public class Financemanager {
    private ArrayList<Transaction> history; // this will store all transactions
    private Stack<Transaction> undoStacl; //this will allow the ability to undo the previous transaction
    private HashMap<String, Double> categoryTotals; // this will store totals by category
}
