import java.util.ArrayList;

public class ExpenseReport extends Report {

    private String employeeName;
    private ArrayList<String> items;
    private ArrayList<Double> itemCosts;

    public ExpenseReport(String title, String author, String date, String name) {
        super(title, author, date);
        this.employeeName = name;
        items = new ArrayList<>();
        itemCosts = new ArrayList<>();
    }

    @Override
    public void print() {
        // Set the first section string in the inherited array list sections to the string:
        // "Employee Name: " followed by the employee name followed by "\n"
        sections.add("Employee Name: " + employeeName + "\n");

        // Then set each subsequent string in the inherited sections arraylist to the item description (from items array list)
        // followed by " " followed by the item cost (from itemCosts array list)
        for (int i = 0; i < items.size(); i++) {
            sections.add(items.get(i) + " " + itemCosts.get(i));
        }

        // Then finally print the expense report by properly calling the print() method in the superclass Report
        super.print();
    }

    // Create a method void addItem(String itemName, double cost) that adds the expense item to the array list of items
    // and adds the cost to the array list of itemCosts
    public void addItem(String itemName, double cost) {
        items.add(itemName);
        itemCosts.add(cost);
    }
}
