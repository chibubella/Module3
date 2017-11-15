import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ImageEventhandler implements EventHandler<MouseEvent>{



	@Override
	public void handle(MouseEvent event) {
		ImageView im = (ImageView)event.getSource();
		im.setRotate((im.getRotate() + 45)%360);
	}

}
