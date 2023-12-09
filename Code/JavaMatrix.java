package Code;

public class JavaMatrix {
    private static int partition(int[] arr, int low, int high) {
        int pivot =arr[high];
        int pivotLoc = low;

        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotLoc];
                arr[pivotLoc] = temp;
                pivotLoc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotLoc];
        arr[pivotLoc] = temp;

        return pivotLoc;
    }

    private static int kthSmallest(int arr[], int low, int high, int k) {
        int par = partition(arr, low, high);
        
        if (par == k - 1) return arr[par];
        else if (par < k - 1) 
            return kthSmallest(arr, par+1, high, k);
        else
            return kthSmallest(arr, low, par-1, k);
    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 4, 5, 8, 6, 11, 26 };
        int k = 3;

        int result = kthSmallest(array, 0, array.length-1, k-1);

        System.out.println(result);
    }
}
