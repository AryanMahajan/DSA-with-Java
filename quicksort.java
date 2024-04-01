public class quicksort{

    public static int partition(int[]arr,int low,int high){
        int pivot=arr[high]; // rightmost element is always the pivot
        int i=(low-1);  // index of smaller element
        for (int j=low;j<=high-1;j++){
            if (arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp1=arr[i];
        arr[i]=pivot;
        arr[high]=temp1;
        return i;
    }

    public static void qs(int[]arr,int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            qs(arr, low, pidx-1);
            qs(arr,pidx+1,high);
        }
    }

    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;

        qs(arr, 0, (n-1));

        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}