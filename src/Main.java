import java.util.List;

import static java.util.Arrays.*;

public class Main {
    /*** STUDENT : Maksat Kadyrbekov
     *
     */
    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.add("Buy milk", List.of("groceries"));
        list.add("Do homework", List.of("school"));
        list.complete("Buy milk");
        list.showAll();
        list.showByTag("school");
        list.clearAll();
        list.showAll();
    }
}



