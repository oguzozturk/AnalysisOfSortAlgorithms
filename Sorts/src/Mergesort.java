

public class Mergesort{
	private static int []a;
	public static void main(String[] args){
		
		 a = getArray();
		 //printArray(a);
		 
		 long startTime = System.currentTimeMillis();
		 sort(getArray());
		 
		 long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      System.out.println();
	      System.out.println(elapsedTime+":"+startTime+"-"+stopTime);
	      
		 System.out.println();
		// printArray(a);
   }

    public static int[] sort(int[] array){
        mergeSort(array, 0, array.length - 1);
        return array;
    }

    private static void mergeSort(int[] array, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }

    
    private static void merge(int[] array, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        for(int i = 0; i < n1; i++){
            left[i] = array[p + i];
        }

        for(int j = 0; j < n2; j++){
            right[j] = array[q + j + 1];
        }

        left[n1] = Integer.MAX_VALUE;	// null indicates infinity
        right[n2] = Integer.MAX_VALUE;

        for(int i = 0,  j = 0,  k = p; k <= r; k++){
            if(left[i] <= right[j]){
                array[k] = left[i++];
            }else{
                array[k] = right[j++];
            }
        }
    }

	public static int[] getArray(){
		int size=10000000;
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
