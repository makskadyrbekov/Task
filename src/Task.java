import java.util.List;

public class Task {
        String description;
        boolean isComplete;
        List<String> tags;

        Task(String description, List<String> tags) {
            this.description = description;
            this.isComplete = false;
            this.tags = tags;
        }
    }

