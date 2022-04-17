package algoritimi;

import java.util.ArrayList;

public abstract class Algoritmo {

	private int inputsize;
	protected ArrayList<Integer> array;

	public Algoritmo() {
		impostaDimensioneInput(100); 
	}

	public abstract void esegui();

	public void impostaDimensioneInput(int size) {
		this.inputsize = size;
		generaInput();
	}

	public boolean generaInput() {

		array = new ArrayList<Integer>(inputsize);
		for (int i = 0; i < inputsize; i++)
			array.add((int) Math.floor(Math.random() * 601));

		return true;
	}
}
