package algoritimi;

import java.util.ArrayList;

public class Tester {

	public static ArrayList<Result> Test(Algoritmo algoritmo, int valorebase, int iterazioni, double incremento,
			Incremento tipo) {

		long start;
		long end;
		ArrayList<Result> results = new ArrayList<Result>();

		int i = 0;
		while (i < iterazioni) {

			algoritmo.impostaDimensioneInput(valorebase);
			/*
			 * il tester per generare il risultato fa una media tra 4 tentativi
			 */
			float valoretotale = 0;
			for (int j = 0; j < 20; j++) {
				start = System.nanoTime();
				algoritmo.esegui();
				end = System.nanoTime();
				valoretotale += end - start;
			}
			results.add(new Result(valorebase, valoretotale / 20));

			/*
			 * in base al tipo di incremento scelto svolgo le operazioni
			 */
			if (tipo == Incremento.MUL)
				valorebase = (int) Math.round(valorebase*incremento);
			else if (tipo == Incremento.SUM)
				valorebase = (int) Math.round(valorebase+incremento);
			i++;
		}

		return results;
	}

}
