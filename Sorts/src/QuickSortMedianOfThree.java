

public class QuickSortMedianOfThree{
	
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
		 //printArray(a);
   }

    public static int[] sort(int[] array){
        quicksort(array, 0, array.length - 1);
        return array;
    }

    public static void quicksort(int[] a, int left, int right){
        if(right <= left){
            return;
        }
        int i = partition(a, left, medianOf3(a, left, right));
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

    public static int medianOf3(int[] data, int left, int right){
    int center = (left + right) / 2;
    // order left & center
    if (data[left] > data[center]){
            swap(data, left, center);
        }
    // order left & right
    if (data[left] > data[right]){
            swap(data, left, right);
        }
    // order center & right
    if (data[center] > data[right]){
            swap(data, center, right);
        }

    swap(data, center, right - 1); // put pivot on right
    return right - 1; // return median value
  }

  public static void swap(int[] data, int dex1, int dex2){
    int temp = data[dex1];
    data[dex1] = data[dex2];
    data[dex2] = temp;
  }

    
    
	public static int[] getArray(){
		int size=10000000;
		int value;
		int []array = new int[size];
		int item = 0;

		//Pre-sorted array
		for(int i=0;i<size;i++){
			array[i] =i;
		}

		//Random array
		/*for(int i=0;i<size;i++){
			 item = (int)(Math.random()*size);
			 array[i] = item;
		}
		//Reverse sorted array
		for(int i=0;i<size;i++){
			array[i] =size-i;
		}
		//Nearly sorted array
		for(int i=0;i<size;i++){
			array[i] =i;
		}
		for(int k=1;k<=array.length/100;k++){
		 	value=(int)(Math.random()*size);
		 	array[value]=(int)(Math.random()*size);
		 }*/
	 	
		
		
		return array;
		
	}

    private void insertion(int[] array, int left, int right){
        for(int i=left;i<=right;i++){
            int value = array[i];
            int j = i - 1;
            while (j>=left && array[j] > value){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }
}