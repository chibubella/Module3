import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ChangeTextEventhandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		Button b = (Button)event.getSource();
		b.setText("Don't Click Me");
	}

}
