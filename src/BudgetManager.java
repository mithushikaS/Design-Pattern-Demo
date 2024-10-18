public class BudgetManager {
    private static BudgetManager instance;
    private BudgetManager() {
        // Initialize budget management details.
    }
    public static BudgetManager getInstance() {
        if (instance == null) {
            instance = new BudgetManager();
        }
        return instance;
    }
    public void addExpense(String category, double amount) {
        System.out.println("Added expense: " + category + " - $" + amount);
    }

    public void removeExpense(String category, double amount) {
        System.out.println("Removed expense: " + category + " - $" + amount);
    }

    public void displayBudget() {
        System.out.println("Displaying budget.");
    }
}
