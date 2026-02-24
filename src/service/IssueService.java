package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        issues.add(new Issue("Server Down", 1));
        issues.add(new Issue("App Crash", 2));
        issues.add(new Issue("Login Error", 3));
        issues.add(new Issue("Slow WiFi", 4));
        issues.add(new Issue("Projector broken", 5));
    }

    public void showMostUrgent() {
        if (!issues.isEmpty()) {
            System.out.println("Most Urgent: " + issues.peek());
        }
    }

    public void resolveIssues() {
        if (!issues.isEmpty()) issues.poll();
        if (!issues.isEmpty()) issues.poll();
    }

    public void printRemainingIssues() {
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
    }
}
