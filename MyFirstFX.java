import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MyFirstFX extends Application {
	public static void main (String [] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//What will the user see
		Image gus = new Image ("https://mgtvwsav.files.wordpress.com/2016/09/gus.jpg");
		
		ImageView iv = new ImageView (gus);
		iv.setRotate(45);
		ImageView iv2 = new ImageView (gus);
		iv2.setRotate(135);
		Button btn = new Button ("Click Me");
		Circle c = new Circle (25);
		c.setFill(Color.BLUEVIOLET);
		c.setStroke(Color.DARKGREEN);
		//Create a pane to hold button and image
		VBox vb = new VBox(10);
		vb.getChildren().addAll(iv, iv2, btn,c);
		//Create our scene 
		Scene s = new Scene (vb);
		primaryStage.setScene(s);
		//Show
		primaryStage.show();
	}
}
