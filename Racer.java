import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Racer extends Application {

	public static void main(String[] args) {
		
		launch();	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ImageView car = new ImageView(new Image("https://images.template.net/wp-content/uploads/2015/11/21154935/Mercedes-Benz-Free-Desktop-Backgrounds.jpg"));
		car.setFitHeight(30);
		car.setFitWidth(45);
		Rectangle rectPath = new Rectangle(40,40,400,100);
		
	//	Path path = new Path();
		PathTransition pathTrans = new PathTransition();
		pathTrans.setPath(rectPath);
		pathTrans.setNode(car);
		pathTrans.setDuration(Duration.millis(4000));
		pathTrans.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pathTrans.setCycleCount(Timeline.INDEFINITE);
		//Create a track around car
		Rectangle outerLine = new Rectangle(20,20,440,140);
		outerLine.setFill(Color.TRANSPARENT);
		outerLine.setStroke(Color.BLUE);
		
		Rectangle innerLine = new Rectangle(60,60,360,60);
		innerLine.setFill(Color.TRANSPARENT);
		innerLine.setStroke(Color.BLACK);
		//create pane, scene and add to stage
		Pane pane = new Pane();
		pane .getChildren().addAll(car,outerLine, innerLine);
		Scene scene = new Scene(pane,800,800);
		primaryStage.setScene(scene);
		primaryStage.show();

		pathTrans.play();
	}

}
