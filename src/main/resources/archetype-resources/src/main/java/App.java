package ${package};


import java.io.IOException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ${package}.model.Model;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ${package}.view.Controller;

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
	
	    try {
	        FXMLLoader loader = new FXMLLoader();
	        
	        loader.setLocation(getClass().getResource("/" + getPackageNamePattern() + "/view/Main.fxml"));
	        
	        Parent mainView = loader.load();
	
	        Controller controller = loader.getController();
	        
	        controller.setApp(this);
	        
	        Scene scene = new Scene(mainView);
	        
	        this.primaryStage.setScene(scene);
            
	        this.primaryStage.show();
	    
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public void copyText(TextArea ta, TextField tf){
		Model m = new Model();
		m.copyText(ta, tf);
	}

	private String getPackageNamePattern(){
		return getClass().getPackage().getName().replace(".", "/");
	}

}
