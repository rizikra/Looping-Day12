import java.util.Scanner;
public class LoopWhileScan {
	public static void println (Object obj){
		System.out.println (obj);
	}
	public static void main (String[] args){
		
		boolean RunApp = true;
		while(RunApp == true){
			Scanner input = new Scanner(System.in);
			println("Pilih 1 untuk lanjut Running Aplikasi : ");
			println("Pilih 2 untuk lanjut Running Aplikasi : ");
			println("Pilih 3 untuk Stop Aplikasi : ");
			int x = input.nextInt();
			switch(x){
				case 1:
				println ("Kamu pilih 1");
				break;
				case 2:
				println ("Kamu pilih 2");
				break;
				default:
				RunApp = false;
				break;
			}
		}
	}
}	