public class LoopWhile {
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main (String[] args){
	
		int SisaUmur = 5;
		while(SisaUmur > 0){
			println ("Keja Bro!");
			SisaUmur--;
			if(SisaUmur == 0){
				println("Kerja mulu, kaya enggak. Malah mati kan haha");
			}
		}
	}
}	