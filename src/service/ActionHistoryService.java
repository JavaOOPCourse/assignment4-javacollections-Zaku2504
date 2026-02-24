package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
    }

    public void undoLastAction() {
        if (!actions.isEmpty()) {
            actions.removeLast();
        }
    }

    public void addRequestedTranscript() {
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        if (!actions.isEmpty()) {
            System.out.println("First Action: " + actions.getFirst());
            System.out.println("Last Action: " + actions.getLast());
        }
    }

    public void printHistory() {
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
