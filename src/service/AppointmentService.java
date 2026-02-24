package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Meeting with Advisor");
        appointments.add("Course Registration Help");
        appointments.add("Internship Inquiry");
        appointments.addFirst("URGENT: Visa Issue");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        if (!appointments.isEmpty()) {
            System.out.println("First: " + appointments.getFirst());
            System.out.println("Last: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
