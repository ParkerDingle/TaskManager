
public class Task {
    private String description;
    private int priority;
    private String dueDate;


    public Task(String description, int priority, String dueDate) {
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return String.format("%s (Priority: %d, Due: %s)", description, priority, dueDate);
    }


}

