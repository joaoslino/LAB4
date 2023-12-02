import javax.swing.*;

public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str  = new StringBuilder(drink.getText());
        str = str.reverse();
        drink.setText(str.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}