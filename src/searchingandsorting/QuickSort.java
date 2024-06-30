package searchingandsorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={1,8,79,45,0};
        QuickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }

    public static int partition(int[] arr,int s,int e){
      int pivot=arr[s];
      int cnt=0;
      for(int i=s+1;i<=e;i++){
          if(arr[i]<=pivot){
              cnt++;
          }
      }

      //place pivot at right position
        int pivotindex = s+cnt;
        swap(arr,pivotindex,s);

      int i=s;
      int j=e;

      while(i<pivotindex && j<pivotindex){
          while (arr[i]<=pivot){
              i++;
          }
          while (arr[j]>pivot){
              j--;
          }

          if(i<pivotindex && j>pivotindex){
              swap(arr,i++,j--);
          }
      }

        return pivotindex;
    }

    public static void QuickSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }


        int p = partition(arr,s,e);

        //left part sort kro
        QuickSort(arr,0,p-1);
        //right part sort kro
        QuickSort(arr,p+1,e);

    }
}
