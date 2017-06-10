package ${package}.view;

import ${package}.App;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller 
{
	@FXML
	private TextArea outText;
	@FXML
	private TextField edit;
	
	private App App;
	
	public Controller(){}
	
	@FXML
    private void initialize() {
		outText.setText("Hello, this is javafx application!");
	}
	
    @FXML
    private void handleAddText() {
        App.copyText(outText,edit);
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }

	public void setApp(App App) {
        this.App = App;
    }

}