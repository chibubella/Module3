import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class DoingEvents extends Application{

	public static void main (String [] args) {
		launch();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox (10);
		Button btnExample = new Button ("Click Me");
		Label msg = new Label("This just displays stuff");
		Image img = new Image ("https://vignette.wikia.nocookie.net/looneytunes/images/0/05/Daffy-duck_00402319.png");
		ImageView iv = new ImageView (img);
		hb.getChildren().addAll(iv,msg,btnExample);
		Scene s = new Scene (hb);
		primaryStage.setScene(s);
		primaryStage.show();
		//handling events
		//btnExample.setOnAction(new ExitEventhandler());
//		btnExample.setOnAction(new ChangeTextEventhandler());
		btnExample.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Button b = (Button)event.getSource();
				b.setText("Don't Click on Me");
			}
		});
		iv.setOnMouseClicked(new ImageEventhandler());
	}

}
