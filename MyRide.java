import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyRide extends Application{

	public static void main(String[] args) {
		launch();
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create the items the user will see/interact with
		Circle c1 = new Circle (50);
		c1.setCenterX(150);
		c1.setCenterY(300);
		c1.setFill(Color.WHITE);
		c1.setStroke(Color.BLACK);
		
		Circle c2 = new Circle (50);
		c2.setCenterX(350);
		c2.setCenterY(300);
		c2.setFill(Color.WHITE);
		c2.setStroke(Color.BLACK);
		
		Rectangle r1 = new Rectangle ();
		r1.setWidth(400);
		r1.setHeight(100);
		r1.setX(50);
		r1.setY(200);
		r1.setFill(Color.BLUE);
		
		Rectangle r2 = new Rectangle();
		r2.setHeight(80);
		r2.setWidth(200);
		r2.setX(150);
		r2.setY(120);
		r2.setFill(Color.MEDIUMPURPLE);
		
		Rectangle r3 = new Rectangle ();
		r3.setHeight(50);
		r3.setWidth(135);
		r3.setX(180);
		r3.setY(135);
		r3.setFill(Color.WHITE);
		
		//container for items
		Pane pane = new Pane();
		//add another container
		pane.getChildren().addAll(c1,c2,r1,r2,r3);
		
		//add container to scene 
		
		Scene s = new Scene (pane,600,600);
		
		//add scene to stage
		primaryStage.setScene (s);
		//show
		primaryStage.show();
		
	}

}
