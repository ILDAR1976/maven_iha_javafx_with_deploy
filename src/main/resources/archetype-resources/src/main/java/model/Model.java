package ${package}.model;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Model{
	public void copyText(TextArea area, TextField field){
		area.setText(area.getText() + "\n" + field.getText());
	}
}