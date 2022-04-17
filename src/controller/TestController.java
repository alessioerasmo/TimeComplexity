package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import algoritimi.Algoritmo;
import algoritimi.BubbleSort;
import algoritimi.Incremento;
import algoritimi.InsertionSort;
import algoritimi.Result;
import algoritimi.Tester;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;

public class TestController implements Initializable {

	/*
	 * Il controller deve impelementare l'interfaccia Initializable(con metodo
	 * initialize), nell'fxml bisogna bindare il file al controllore mediante
	 * l'apposita cella definendo il path. Il path parte da src(lo scope del
	 * progetto), per navigare tra le cartelle si usa il punto "."
	 */

	@FXML
	private LineChart graph;
	@FXML
	private Label label;
	@FXML
	private MenuButton menuAlgorithm;
	@FXML
	private TextArea messaggi;

	/*
	 * Gli elementi della vista hanno un fxid corrispondente ai nomi delle variabili
	 * d'istanza, le variabili hanno bisogno del tag "@FXML"
	 */

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		/*
		 * if (dataseries == null) dataseries = new XYChart.Series();
		 * graph.getData().add(dataseries);
		 */

		/*
		 * XYChart.Series dataSeries1 = new XYChart.Series(); for (float i = 0; i < 4; i
		 * += 0.2) { dataSeries1.getData().add(new XYChart.Data(i, Math.pow(i, 1))); }
		 * 
		 * XYChart.Series dataSeries2 = new XYChart.Series(); for (float i = 0; i < 4; i
		 * += 0.2) { dataSeries2.getData().add(new XYChart.Data(i, Math.pow(i, 2))); }
		 * dataSeries1.setName("paolo"); graph.getData().addAll(dataSeries1,
		 * dataSeries2);
		 */

	}

	@FXML
	public void addPoint() {

	}

	@FXML
	void bubblesortAction(ActionEvent event) {
		menuAlgorithm.setText("Bubble Sort");
	}

	@FXML
	void insertionsortAction(ActionEvent event) {
		menuAlgorithm.setText("Insertion Sort");
	}

	@FXML
	void iniziaTest(ActionEvent event) {
		messaggi.setText("");
		if (menuAlgorithm.getText().equals("Algoritmo"))
			messaggi.setText("nessun algoritmo selezionato...");

		else if (menuAlgorithm.getText().equals("Insertion Sort"))
			algoritmoAction(new BubbleSort(), "Insertion Sort");

		else if (menuAlgorithm.getText().equals("Bubble Sort"))
			algoritmoAction(new BubbleSort(), "Bubble Sort");
	}

	void algoritmoAction(Algoritmo algoritmo, String nome) {

		messaggi.setText("test sull'algoritmo " + nome + " in esecuzione...");

		XYChart.Series series = new XYChart.Series();
		ArrayList<Result> risultati = Tester.Test(algoritmo, 1000, 10, 1.3, Incremento.MUL);

		for (int i = 0; i < risultati.size(); i++) {
			series.getData().add(new XYChart.Data(risultati.get(i).size, risultati.get(i).time));
		}

		messaggi.setText(messaggi.getText()+"\n"+ "test riuscito");
		series.setName(nome);
		graph.getData().add(series);
	}

}
