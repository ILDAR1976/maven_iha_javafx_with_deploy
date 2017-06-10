package ${package}.view;

import java.awt.TextArea;

import App;
import javafx.fxml.FXML;

public class Controller 
{
	@FXML
	private TextArea textOut;
	@FXML
	private TextField edit;
	
	private App App;
	
	public Controller{}
	
	@FXML
    private void initialize() {
		textOut.setText("Hello, this is javafx application!");
	}
	
    @FXML
    private void handleAddText() {
        App.copyText(textOut,edit);
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }

	public void setApp(App App) {
        this.App = App;
    }

}