public class Singleton {
    public static void main(String[] args) {
        // Get the single instance of BudgetManager.
        BudgetManager budgetManager = BudgetManager.getInstance();

        // Use the instance to manage budget.
        budgetManager.addExpense("Groceries", 150.0);
        budgetManager.removeExpense("Groceries", 50.0);
        budgetManager.displayBudget();

        // Attempt to get another instance of BudgetManager.
        BudgetManager anotherBudgetManager = BudgetManager.getInstance();

        // Check if both instances are the same.
        System.out.println("Are both instances the same? " + (budgetManager == anotherBudgetManager));
    }
}
