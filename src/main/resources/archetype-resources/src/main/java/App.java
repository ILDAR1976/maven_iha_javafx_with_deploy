package $package;


import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import test.fx.view.LoaderController;

/**
 * Hello world!
 *
 */
public class App extend Application
{
	private Stage primaryStage;
	
	public static void main( String[] args )
    {
    	launch(args);
    }
    
	@Override
	public void start(Stage primaryStage) throws Exception {
	    this.primaryStage = primaryStage;
	    this.primaryStage.setTitle("Hello world application");
	
	    try {
	        FXMLLoader loader = new FXMLLoader();
	        
	        loader.setLocation(getClass().getResource("/${package}/view/Main.fxml"));
	        
	        AnchorPane mainView = (AnchorPane) loader.load();
	
	        rootLayout.setCenter(mainView);
	        
	        LoaderController controller = loader.getController();
	        controller.setApp(this);
	    
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}
