
public class Quicksort {
	private static int []a;
	public static void main(String[] args ){

	 	a = getArray();
	 	
	 	/*for(c=0;c<10000;c++){
	 		array[c]=c;
	 		
	 	}*/

	 	
	 	long startTime = System.currentTimeMillis();
	 
	 	sort(getArray());
	 
	     long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime+":"+startTime+"-"+stopTime);
	
}

    public static int[] sort(int[] array){
        quicksort(array, 0, array.length - 1);
        return array;
    }


    public static void quicksort(int[] a, int left, int right){
        if(right <= left){
            return;
        }
        int i = partition(a, left, left + (right-left)/2);
        quicksort(a, left, i - 1);
        quicksort(a, i + 1, right);
    }


    public static int partition(int[] array, int p, int r){
    	
	int x = array[r]; // x is the pivot
	int i = p - 1;
	for (int j = p; j < r; j++) {
	    if (array[j] <= x) {
		i++;
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
	    }
	}
	int t = array[i+1];
	array[i+1] = array[r];
	array[r] = t;
	return i + 1;
    }
    
    public static int[] getArray(){
		int size=100000000;
		int value;
		int []array = new int[size];
		int item = 0;
		
		//Pre-sorted array
		for(int i=0;i<size;i++){
			array[i] = i;
			
		}

		//Random array
		/*for(int i=0;i<size;i++){
			 item = (int)(Math.random()*size);
			 array[i] = item;			
			
		}
		//Reverse sorted array
		for(int i=0;i<size;i++){
			array[i] = size-i;
			
		}
		//Nearly sorted array
		for(int i=0;i<size;i++){
			array[i] = i;
			
		}
		for(int k=1;k<=array.length/100;k++){
		 	value=(int)(Math.random()*size);
		 	array[value]=(int)(Math.random()*size);
		 }*/
		
		return array;
		
	}
    
}
