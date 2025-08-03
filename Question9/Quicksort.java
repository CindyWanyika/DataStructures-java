package Question9;

public class Quicksort {
    public static void Quicksort(Book[] bookArray){
        int start=0;
        int end=bookArray.length-1;
        sort(bookArray,start,end);
    }

    public static void sort(Book[] arr,int start,int end){
        if(start<end){
            int p=partition(arr,start,end);
            sort(arr,start,p-1);
            sort(arr,p+1,end);
        }
    }

    public static int partition(Book[] arr,int start,int end){
        int pivot=end;
        double price=arr[pivot].getPrice();
        int i=start-1;
        for(int j=start;j<end;j++){
            if(arr[j].getPrice()<price){
                i++;
                Book curr=arr[i];
                arr[i]=arr[j];
                arr[j]=curr;
            } else if (arr[j].getPrice()==price) {
                int compare=arr[end].getTitle().compareToIgnoreCase(arr[j].getTitle());
                if(compare>0){
                    i++;
                    Book curr=arr[i];
                    arr[i]=arr[j];
                    arr[j]=curr;
                }

            }
        }
        Book last=arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=last;

        return i+1;
    }
}
