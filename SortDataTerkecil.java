public class SortDataTerkecil {//
	public static void println (Object obj){
		System.out.println (obj);
	}
	
	public static void main (String[] args){//
		int[] data = {3, 10, 5, 50, 51, 2, 4, -2, 6};
		
		for(int index = 0; index < data.length; index++){
			int LowestIndex = index;
				for (int i = LowestIndex; i < data.length; i++){
					if(data[LowestIndex] > data [i]){
						LowestIndex = i;
						
					}
				}
			int temp = data [index];
			data [index] = data [LowestIndex];
			data [LowestIndex] = temp;
				
		}
		
		for(int j = 0; j < data.length; j++){
			println(data[j]);
		}
	}
}	