package MINGGU7.MergeSortTest;
/**
 * MergeSorting05
 */
public class MergeSorting05 {

    public void mergeSort(int[] data){
        sort(data, 0,7);
    }
    public void merge(int[] data, int left,int middle, int rigth){
        int[] temp = new int[data.length];
        for(int i = left; i<= rigth; i++){
            temp[i] =data[i];
        }
        int a = left;        
        int b = middle +1;
        int c = left;

        while (a<=middle && b<=rigth) {
            if(temp[a]<=temp[b]){
                data[c] = temp[a];
                a++;
            }else{
                data[c]=temp[b];
                b++;
            }
            c++;
        }
        int s = middle-a;
        for(int i =0; i<=s; i++){
            data[c+i]=temp[a+i];
        }
    }
    public void sort(int data[], int left, int rigth){
        if(left<rigth){
            int middle = (left+rigth)/2;
            sort(data, left, middle);
            sort(data, middle+1, rigth);
            merge(data, left, middle, rigth);
        }
    }
    public void printArray(int arr[]) {
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}