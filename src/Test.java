
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import algoritimi.*;

public class Test extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		/*
		 * primaryStage.setTitle("My First JavaFX App");
		 * 
		 * primaryStage.show();
		 */

		Parent p = FXMLLoader.load(getClass().getResource("/views/test.fxml"));
		Scene scene = new Scene(p);
		primaryStage.setScene(scene);
		primaryStage.show();



	}

	public static void main(String[] args) {
		//Application.launch(args);
		//System.out.println(Tester.Test(new InsertionSort(), 10, 5, 10, Incremento.MUL));
		MergeSort a = new MergeSort();
		a.merge();
	}

}
