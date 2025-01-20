package sort;

public class SelectionSort {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0; i<arr.length; i++){
            //finding minimum of arr
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=i; j<arr.length; j++){
                
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                    
                }
            }
            //swap the minimum value 
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            
        }
        
    }
}
