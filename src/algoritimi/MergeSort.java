package algoritimi;

import java.util.ArrayList;

public class MergeSort extends Algoritmo {

	@Override
	public void esegui() {
		MergeSort.mergeSort(array, array.size(), 0, array.size() - 1);
	}

	private static void mergeSort(ArrayList<Integer> array, int length, int beginIndex, int endIndex) {

		if (length < 2)
			return;

	}

	private static void merge(ArrayList<Integer> array, int firstBegin, int firstEnd, int secondBegin, int secondEnd) {
	
	int aindex = firstBegin;
	int bindex = secondBegin;
	int cindex = 0;
	
	ArrayList<Integer> c = new ArrayList<>( (firstEnd- firstBegin) + (secondEnd - secondBegin) +2 );
		
	while (cindex < c.size() && aindex <= firstEnd && bindex <= secondEnd) {
		if(array.get(aindex) <= array.get(bindex)) {
			c.set(cindex++, array.get(aindex++));
		} else {
			c.set(cindex++, array.get(bindex++));
		}
	}
	
	while (aindex <= firstEnd)
		c.set(cindex++, array.get(aindex++));
	while (bindex <= secondEnd)
		c.set(cindex++, array.get(bindex++));
	
	System.out.println(c);
	
	}

	public void merge() {
		int[] a = { 0, 3, 5, 88, 990 };
		int[] b = { 1, 2, 5, 6,6, 8, 1289170};

		int[] c = new int[a.length + b.length];

		int aindex = 0;
		int bindex = 0;
		int cindex = 0;

		while (cindex < c.length && aindex < a.length && bindex < b.length) {
			if (a[aindex] <= b[bindex]) {
				c[cindex++] = a[aindex++];
			} else {
				c[cindex++] = b[bindex++];
			}
		}
		while (aindex < a.length)
			c[cindex++] = a[aindex++];
		while (bindex < b.length)
			c[cindex++] = b[bindex++];

		for (int i = 0; i < c.length; i++)
			System.out.println(c[i]);
	}
}
