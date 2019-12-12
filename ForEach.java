public class ForEach {
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main (String[] args){
		int[] data = {1, 3, 5, 7, 9};
		
		for (int x : data){
			println(x);
		}
	}
}