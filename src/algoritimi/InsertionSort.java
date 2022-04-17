package algoritimi;

public class InsertionSort extends Algoritmo {

	@Override
	public void esegui() {
		
		int n = array.size();
        for (int i = 1; i < n; ++i) {
            int key = array.get(i);
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array.get(j) > key) {
                array.set(j+1, array.get(j));
                j = j - 1;
            }
            array.set(j+1, key);
            
        }
	}

}
