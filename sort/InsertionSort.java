public class InsertionSort {
    public void insertionSort(int arr[]) {
        // code here
        
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        InsertionSort ob1 = new InsertionSort();
        int []arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Befor sorting the array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        ob1.insertionSort(arr);
        System.out.println("\nAfter sorting the array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
