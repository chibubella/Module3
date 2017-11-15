import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MyMediaPlayer extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Create media and player
		Media media = new Media("http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv");
		MediaPlayer mp = new MediaPlayer(media);
		mp.setAutoPlay(true);
		MediaView mv = new MediaView(mp);
		
		Button pause = new Button("Pause");
		pause.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				mp.pause();
			}
		});
		
		Button play = new Button("Play");
		play.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle (ActionEvent e) {
				mp.play();
			}
		});
		
		Button stop = new Button ("Stop");
		stop.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent e) {
				mp.stop();
			}
		});
		
		Button mute = new Button("Mute");
		mute.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				mp.setMute(true);
			}
		});
		
		// add pane, scene etc
		HBox controls = new HBox(10);
		controls.setLayoutX(0);
		controls.setLayoutY(220);
		controls.getChildren().addAll(play,pause,stop,mute);
		Pane p = new Pane();
		p.getChildren().addAll(mv,controls);
		Scene s = new Scene(p,550,250);
		primaryStage.setScene(s);
		primaryStage.show();
		
		
	}
}