package ${package}.ui.controller;

import ${package}.basic.om.App;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Controller extends BorderPane
{
	@FXML
	private TextArea outText;
	@FXML
	private TextField edit;
	
	private App App;
	
	final static Logger logger = LogManager.getLogger(Controller.class);
	
	public Controller(){
	    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("Main.fxml"));

        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
	
	getStyleClass().add("main-window");

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
   }
	
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