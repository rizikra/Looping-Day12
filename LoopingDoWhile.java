public class LoopingDoWhile {
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main (String[] args){
		
		int battery = 0;
		do{
			println("Nyalakan HP !");
			battery--;	
		}while(battery > 0);
	}
}	