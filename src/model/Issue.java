package model;

public class Issue implements Comparable<Issue> {

    String description;
    int urgencyLevel; // 1 = most urgent

    public Issue(String description, int urgencyLevel) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    @Override
    public int compareTo(Issue other) {
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    @Override
    public String toString() {
        return "Issue{description='" + description + "', urgency=" + urgencyLevel + "}";
    }
}
