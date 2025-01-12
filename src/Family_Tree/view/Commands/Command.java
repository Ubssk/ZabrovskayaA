package Family_Tree.view.Commands;

import Family_Tree.view.ConsoleUI;
import Family_Tree.view.View;

public abstract class Command {
    String description;
    private View view;
    ConsoleUI consoleUI;

    public Command(String description, View view) {
        this.description = description;
        this.view = view;
    }

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    public String getDescription(){
        return description;
    }

    View getView() {
        return view;
    }

    public abstract void execute();
}
