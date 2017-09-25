package ${package}.basic.om;

import ${package}.ui.model.Model;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import ${package}.ui.controller.Controller;

/**
 * Hello world!
 *
 */
public class App extends Application
{
	private Stage primaryStage;
	final static Logger logger = LogManager.getLogger(App.class);
	
	public static void main( String[] args )
    {
		try{
			
			logger.log(Level.INFO, "Application runnig ...");

			launch(args);
		
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
	    this.primaryStage = primaryStage;
	    this.primaryStage.setTitle("Hello world application");

		Controller controller = new Controller();

		controller.setApp(this);

		controller.prefWidthProperty().bind(primaryStage.widthProperty());

		controller.prefHeightProperty().bind(primaryStage.heightProperty());

		Group root = new Group();

		root.getChildren().addAll(controller);

                Scene scene = new Scene(root,300,500);

		scene.getStylesheets()
			.add(getClass().getClassLoader().getResource("Main.css").toExternalForm());
		
		this.primaryStage.getIcons().add(new Image(getClass().getClassLoader().getResource("Main.jpg").toString()));

		this.primaryStage.setScene(scene);

		this.primaryStage.show();
	    
	}

	public void copyText(TextArea ta, TextField tf){
		Model m = new Model();
		m.copyText(ta, tf);
	}



}
