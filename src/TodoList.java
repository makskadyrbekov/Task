import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Task> tasks = new ArrayList<>();

    public void add(String description, List<String> tags) {
        if (description.isBlank()) {
            System.out.println("Task description cannot be empty.");
            return;
        }
        for (Task task : tasks) {
            if (!task.isComplete && task.description.equals(description)) {
                System.out.println("Duplicate task detected.");
                return;
            }
        }
        tasks.add(new Task(description, tags));
        System.out.println("Task added: " + description);
    }

    public void complete(String description) {
        for (Task task : tasks) {
            if (task.description.equals(description)) {
                task.isComplete = true;
                System.out.println("Task completed: " + description);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void showAll() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            String status = task.isComplete ? "[Done]" : "[Pending]";
            System.out.println(status + " " + task.description);
        }
    }

    public void showByTag(String tag) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.tags.contains(tag)) {
                System.out.println(task.description);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks with tag: " + tag);
        }
    }

    public void clearAll() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}

