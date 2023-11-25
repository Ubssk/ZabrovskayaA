package Family_Tree.view.Commands;

import Family_Tree.view.View;

public class Add extends Command{

    public Add(View view) {
        super("Добавить студента", view);
    }

    public void execute(){
        getView().add();
    }
}