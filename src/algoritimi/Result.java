package algoritimi;

public class Result {
	public int size;
	public double time;
	
	public Result(int size, double time) {
		this.size = size;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "[input: " + size + "]" +" [time: " + time + "]";
	}
}