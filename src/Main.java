import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        // Initialize and run required tasks
        studentService.initializeStudents();
        studentService.removeLowGPA();
        studentService.insertAtIndex();
        
        appointmentService.initializeAppointments();
        appointmentService.cancelLast(); // Task: Cancel last appointment
        
        issueService.initializeIssues();
        issueService.resolveIssues(); // Task: Resolve 2 issues
        
        actionService.initializeActions();
        actionService.addRequestedTranscript();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    studentService.printStudents();
                    studentService.findHighestGPA();
                    break;
                case 2:
                    appointmentService.printAppointments();
                    appointmentService.showFirstAndLast();
                    break;
                case 3:
                    issueService.printRemainingIssues();
                    issueService.showMostUrgent();
                    break;
                case 4:
                    actionService.printHistory();
                    actionService.showFirstAndLast();
                    break;
                case 5:
                    System.out.print("Enter issue: ");
                    String desc = scanner.nextLine();
                    System.out.print("Enter urgency (1-5): ");
                    int level = scanner.nextInt();
                    issueService.addNewIssue(desc, level);
                    break;
                case 6:
                    actionService.undoLastAction();
                    System.out.println("Last action undone.");
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 7);
    }
}
