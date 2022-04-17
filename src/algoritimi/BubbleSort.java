package algoritimi;

public class BubbleSort extends Algoritmo {

	@Override
	public void esegui() {
		for (int i = 0; i < array.size(); i++) {
			boolean flag = false;
			for (int j = 0; j < array.size() - 1; j++) {
				// Se l' elemento j e maggiore del successivo allora
				// scambiamo i valori
				if (array.get(j) > array.get(j + 1)) {
					int k = array.get(j);
					array.set(j, array.get(j + 1));
					array.set(j + 1, k);
					flag = true; // Lo setto a true per indicare che é avvenuto uno scambio
				}
			}
			if (!flag)
				break; // Se flag=false allora vuol dire che nell' ultima iterazione
						// non ci sono stati scambi, quindi il metodo può terminare
						// poiché l' array risulta ordinato
		}

	}

}
