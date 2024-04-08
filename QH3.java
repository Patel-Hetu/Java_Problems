/*
 * A program to test two subclasses of superclass Report: ExpenseReport and StudentReportCard
 */
public class QH3
{
	public static void main(String[] args)
	{
		StudentReportCard reportCard = new StudentReportCard("Report Card", "Ryerson Univ.", "April 2021", "T. McInerney");
		reportCard.addCourse("CPS209", 99);
		reportCard.addCourse("CPS511", 97);
		reportCard.addCourse("CPS643", 98);
		reportCard.addCourse("CPS841", 90);

		System.out.println("Testing Report Card\n");
		Report report = reportCard;
		report.print();
		System.out.println("\nExpected:\nReport Card\n\nRyerson Univ.   April 2021\nStudent Name: T. McInerney\n");
		System.out.println("CPS209 99\nCPS511 97\nCPS643 98\nCPS841 90");
		
		ExpenseReport expenseReport = new ExpenseReport("Expense Report", "Google Tech.", "Nov. 2020", "T. McInerney");
		expenseReport.addItem("Hotel", 550.0);
		expenseReport.addItem("Flight", 1020.0);
		expenseReport.addItem("Taxis", 220.0);
		expenseReport.addItem("Food", 354.0);

		System.out.println("\nTesting Expense Report\n");
		report = expenseReport;
		report.print();
		System.out.println("\nExpected:\nExpense Report\n\nGoogle Tech.   Nov. 2020\nEmployee Name: T. McInerney\n");
		System.out.println("Hotel 550.0\nFlight 1020.0\nTaxis 220.0\nFood 354.0");
	}
}
