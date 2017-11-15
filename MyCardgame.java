import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyCardgame extends Application {
	private int index = 0;
	ImageView [] SetOfCards;
	HBox mainPane;
	public static void main (String [] args) {
		launch();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create images and add to array
//		SetOfCards = new ImageView [4];
//		SetOfCards [0] = new ImageView(new Image("http://cultmoviecards.com/img/ah-cult-movie-cards.png"));
//		SetOfCards [1] = new ImageView(new Image("http://cultmoviecards.com/img/ac-cult-movie-cards.png"));
//		SetOfCards [2] = new ImageView(new Image("http://cultmoviecards.com/img/as-cult-movie-cards.png"));
//		SetOfCards [3] = new ImageView(new Image("http://cultmoviecards.com/img/ad-cult-movie-cards.png"));
		
		StackPane sPane = new StackPane();
		sPane.getChildren().add(new ImageView(new Image("http://cultmoviecards.com/img/ah-cult-movie-cards.png")));
		sPane.getChildren().add(new ImageView(new Image("http://cultmoviecards.com/img/ac-cult-movie-cards.png")));
		sPane.getChildren().add(new ImageView(new Image("http://cultmoviecards.com/img/as-cult-movie-cards.png")));
		sPane.getChildren().add(new ImageView(new Image("http://cultmoviecards.com/img/ad-cult-movie-cards.png")));
		//Create Buttons
		Button btnExit = new Button ("Exit");
		Button btnFwd = new Button ("Forward");
		Button btnBck = new Button ("Back");
		//Set the size of the buttons
		btnExit.setPrefSize(120, 50);
		btnBck.setPrefSize(120, 50);
		btnFwd.setPrefSize(120, 50);
		//Create anonymous class for button
		btnExit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		
		/*btnBck.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int oldIndex = index;
				if(index == 0) {
					index = 4-1;
				}
				else {
					index = (index-1)%4;
				}
				mainPane.getChildren().remove(SetOfCards[oldIndex]);
				mainPane.getChildren().add(SetOfCards[index]);
				
			}
		});*/
		
		btnBck.setOnAction(new EventHandler <ActionEvent>() {
			public void handle(ActionEvent e) {
				sPane.getChildren().get(3).toBack();
			}
		});
		
		btnFwd.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//to make it go round and round
				int oldIndex = index;
				index = (index+1)%4;
				mainPane.getChildren().remove(SetOfCards[oldIndex]);
				mainPane.getChildren().add(SetOfCards[index]);
			}
		});
		VBox rowofButtons = new VBox (25);
		rowofButtons.getChildren().addAll(btnBck, btnExit, btnFwd);
		mainPane = new HBox (10);
		mainPane.getChildren().addAll(rowofButtons, SetOfCards[0]);
		Scene s = new Scene (mainPane);
		primaryStage.setScene(s);
		primaryStage.setTitle("My Card Game");
		primaryStage.show();
		//btnExit.setOnAction(new ExitEventhandler());
		//btnFwd.setOnMouseClicked(value);
		//btnFwd.setOnMouseClicked(value);
		
	}

}
