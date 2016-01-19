
public class InsertionSort {
public static void main(String[] args ){

		    int d,t,c;
		    int size=100000;
		    int item;
		 	int [] array=new int[size];
		 	int value;
		 	
			//Pre-sorted array
		 	for(c=0;c<size;c++){
		 		array[c] = c;

		 	}

			//Random array
		 	/*for(c=0;c<size;c++){
		 	 	item = (int)(Math.random()*size);
			 	array[c] = item;
		 	}
			//Reverse sorted array
		 	for(c=0;c<size;c++){
		 		array[c] = size-c;

		 	}
		 	//Nearly sorted array
		 	for(c=0;c<size;c++){
		 		array[c] = c;

		 	}
			for(int k=1;k<=array.length/100;k++){
			 	value=(int)(Math.random()*size);
			 	array[value]=(int)(Math.random()*size);
			}*/

		 	
		 	long startTime = System.currentTimeMillis();
		 
		 	insertSort(array);
		 
		     long stopTime = System.currentTimeMillis();
		      long elapsedTime = stopTime - startTime;
		      System.out.println(elapsedTime+":"+startTime+"-"+stopTime);
		
	}
	public static void insertSort(int[] A){
	  for(int i = 1; i < A.length; i++){
	    int value = A[i];
	    int j = i - 1;
	    while(j >= 0 && A[j] > value){
	      A[j + 1] = A[j];
	      j = j - 1;
	    }
	    A[j + 1] = value;
	  }
	}
	

}